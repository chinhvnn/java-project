package chinhworkshop.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import chinhworkshop.DTO.ProductsDTO;
import chinhworkshop.DTO.ProductsDTOmapper;

@Repository
public class Products_filterDAO extends BaseDAO {

	private String sqlFilterProducts(int key, String[] brand, String[] price, String[] size, String pageId, String itemPerPage, String sort) {
		StringBuffer sqlFilterProducts = sqlSeclectProducts();
		
		sqlFilterProducts.append(" WHERE 1 = 1");
		if (brand != null) {
			sqlFilterProducts.append(" AND (p.id_product = " + "''");
			for (int i = 0; i < brand.length; i++) {
			sqlFilterProducts.append(" OR p.id_brand = " + "'" + brand[i] + "'");
			}
			sqlFilterProducts.append(")");
		}
		if (price != null) {
			sqlFilterProducts.append(" AND (p.id_product = " + "''");
			for (int i = 0; i < price.length; i++) {
				if (price[i].equals("below2m")) {
					sqlFilterProducts.append(" OR p.price <= 2000000 ");
				}
				if (price[i].equals("2m-4m")) {
					sqlFilterProducts.append(" OR p.price > 2000000 ");
					sqlFilterProducts.append(" AND p.price <= 4000000 ");
				}
				if (price[i].equals("above4m")) {
					sqlFilterProducts.append(" OR p.price > 4000000 ");
				}
			}
			sqlFilterProducts.append(")");
		}
		if (size != null) {
			sqlFilterProducts.append(" AND (p.id_product = " + "''");
			for (int i = 0; i < size.length; i++) {
				if (size[i].equals("below40")) {
					sqlFilterProducts.append(" OR pp.size <= 40 ");
				}
				if (size[i].equals("40-42")) {
					sqlFilterProducts.append(" OR pp.size > 40 ");
					sqlFilterProducts.append(" AND pp.size <= 42 ");
				}
				if (size[i].equals("above42")) {
					sqlFilterProducts.append(" OR pp.size > 42");
				}
			}
			sqlFilterProducts.append(")");
		}
		switch (key) {
		case 0:// seclect all filter product
			break;
		case 1:// select filter product
			int sp = Integer.parseInt(itemPerPage);
			int trang = Integer.parseInt(pageId);
			if (sort.equals("2")){
				sqlFilterProducts.append(" ORDER BY p.price ASC");
			}
			if (sort.equals("3")){
				sqlFilterProducts.append(" ORDER BY p.price DESC");
			}
			sqlFilterProducts.append(" LIMIT "+(trang*sp-sp)+", "+sp);
			break;
		
		}
		return sqlFilterProducts.toString();
	}

	public List<ProductsDTO> FilterAllProducts(String[] brand, String[] price, String[] size, String pageId,
			String itemPerPage, String sort) {
		List<ProductsDTO> list = new ArrayList<ProductsDTO>();
		String sql= sqlFilterProducts(0, brand, price, size, pageId, itemPerPage, sort);
		list = _jbdcTemplate.query(sql, new ProductsDTOmapper());
		return list;
	}
	public List<ProductsDTO> FilterProducts(String[] brand, String[] price, String[] size, String pageId,
			String itemPerPage, String sort) {
		List<ProductsDTO> list = new ArrayList<ProductsDTO>();
		String sql= sqlFilterProducts(1, brand, price, size, pageId, itemPerPage, sort);
		list = _jbdcTemplate.query(sql, new ProductsDTOmapper());
		return list;
	}
	public String urlFilter(String[] brand, String[] price, String[] size) {
		String urlStr = "?";
		if (brand != null) {
			for (int i = 0; i < brand.length; i++) {
				urlStr=urlStr+"brand=" + brand[i] + "&";
			}
		}
		if (price != null) {
			for (int i = 0; i < price.length; i++) {
				urlStr=urlStr+"price=" + price[i] + "&";
			}
		}
		if (size != null) {
			for (int i = 0; i < size.length; i++) {
				if (size[i].equals("below40")) {
					urlStr=urlStr+"size=below40&";
				}
				if (size[i].equals("40-42")) {
					urlStr=urlStr+"size=40-42&";
				}
				if (size[i].equals("above42")) {
					urlStr=urlStr+"size=above42&";
				}
			}
		}
		return urlStr;
	}
}
