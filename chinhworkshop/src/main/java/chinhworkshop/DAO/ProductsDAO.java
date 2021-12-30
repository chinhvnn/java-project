package chinhworkshop.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import chinhworkshop.DTO.ProductsDTO;
import chinhworkshop.DTO.ProductsDTOmapper;

@Repository
public class ProductsDAO extends BaseDAO{
	
	private String sqlProducts(int key, String ID, String itemPerPage,String sort) {
		StringBuffer sqlProducts = sqlSeclectProducts();
		//sqlProducts.append(" WHERE 1 = 1");
		switch (key) {
		case 0:// seclect all product
			break;
		case 1:// new product
			sqlProducts.append(" WHERE p.new_prd = true");
			break;
		case 2:// best product
			sqlProducts.append(" WHERE p.best_prd = true");
			break;
		case 3:// sale product
			sqlProducts.append(" WHERE p.sale_prd = true");
			break;
		case 4:// paginate product
			int sp = Integer.parseInt(itemPerPage);
			int trang = Integer.parseInt(ID);
			if (sort.equals("2")){
				sqlProducts.append(" ORDER BY p.price ASC");
			}
			if (sort.equals("3")){
				sqlProducts.append(" ORDER BY p.price DESC");
			}
			sqlProducts.append(" LIMIT "+(trang*sp-sp)+", "+sp);
			break;
		case 5:// get by ID
			sqlProducts.append(" WHERE p.id_product = "+ID);
			break;
			
			
		default:
			break;
		}
		return sqlProducts.toString();
	}
	
	public List<ProductsDTO> GetsAllProducts() {
		List<ProductsDTO> list = new ArrayList<ProductsDTO>();
		String sql= sqlProducts(0, "", "", "");
		list = _jbdcTemplate.query(sql, new ProductsDTOmapper());
		return list;
	}
	public List<ProductsDTO> GetsNewProducts() {
		List<ProductsDTO> list = new ArrayList<ProductsDTO>();
		String sql= sqlProducts(1, "", "", "");
		list = _jbdcTemplate.query(sql, new ProductsDTOmapper());
		return list;
	}
	public List<ProductsDTO> GetsBestProducts() {
		List<ProductsDTO> list = new ArrayList<ProductsDTO>();
		String sql= sqlProducts(2,"","", "");
		list = _jbdcTemplate.query(sql, new ProductsDTOmapper());
		return list;
	}
	public List<ProductsDTO> GetsSaleProducts() {
		List<ProductsDTO> list = new ArrayList<ProductsDTO>();
		String sql= sqlProducts(3,"","", "");
		list = _jbdcTemplate.query(sql, new ProductsDTOmapper());
		return list;
	}
	public List<ProductsDTO> GetsDataProducts(String pageId, String itemPerPage,  String sort) {
		List<ProductsDTO> list = new ArrayList<ProductsDTO>();
		String sql= sqlProducts(4,pageId,itemPerPage, sort);
		list = _jbdcTemplate.query(sql, new ProductsDTOmapper());
		return list;
	}
	public ProductsDTO GetDataProductsByID(int id_item) {
		String id = Integer.toString(id_item);
		String sql= sqlProducts(5,id,"", "");
		ProductsDTO product = _jbdcTemplate.queryForObject(sql, new ProductsDTOmapper());
		return product;
	}

	
	
}
