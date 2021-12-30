package chinhworkshop.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import chinhworkshop.DTO.ProductsDTO;
import chinhworkshop.DTO.ProductsDTOmapper;

@Repository
public class Products_detailDAO extends BaseDAO {

	private String sqlProducts(String id_product) {
		StringBuffer sqlDetailProducts = sqlSeclectProducts();
		sqlDetailProducts.append(" WHERE p.id_product = "+id_product);
		return sqlDetailProducts.toString();
	}

	public List<ProductsDTO> GetDetailProduct(String id_product) {
		List<ProductsDTO> list = new ArrayList<ProductsDTO>();
		String sql = sqlProducts(id_product);
		list = _jbdcTemplate.query(sql, new ProductsDTOmapper());
		return list;
	}
}
