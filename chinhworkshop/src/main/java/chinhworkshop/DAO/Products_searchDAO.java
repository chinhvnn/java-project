package chinhworkshop.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import chinhworkshop.DTO.ProductsDTO;
import chinhworkshop.DTO.ProductsDTOmapper;

@Repository
public class Products_searchDAO extends BaseDAO {

	private String sqlProducts(int key, String search, String pageId, String itemPerPage, String sort) {
		StringBuffer sqlSearchProducts = sqlSeclectProducts();
		sqlSearchProducts.append(" WHERE p.name like " + "'%" + search + "%'");
		
		switch (key) {
		case 0:// seclect all search product
			break;
		case 1:// select search product
			int sp = Integer.parseInt(itemPerPage);
			int trang = Integer.parseInt(pageId);
			if (sort.equals("2")){
				sqlSearchProducts.append(" ORDER BY p.price ASC");
			}
			if (sort.equals("3")){
				sqlSearchProducts.append(" ORDER BY p.price DESC");
			}
			sqlSearchProducts.append(" LIMIT "+(trang*sp-sp)+", "+sp);
			break;
		
		}
		
		
		return sqlSearchProducts.toString();
	}

	public List<ProductsDTO> GetSearchAllProducts(String keyword) {
		List<ProductsDTO> list = new ArrayList<ProductsDTO>();
		String sql = sqlProducts(0, keyword,"","","");
		list = _jbdcTemplate.query(sql, new ProductsDTOmapper());
		return list;
	}
	public List<ProductsDTO> GetSearchProducts(String keyword, String pageId, String itemPerPage, String sort) {
		List<ProductsDTO> list = new ArrayList<ProductsDTO>();
		String sql = sqlProducts(1, keyword,pageId,itemPerPage,sort);
		list = _jbdcTemplate.query(sql, new ProductsDTOmapper());
		return list;
	}
}
