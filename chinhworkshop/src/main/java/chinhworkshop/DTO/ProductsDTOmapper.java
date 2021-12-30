package chinhworkshop.DTO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductsDTOmapper implements RowMapper<ProductsDTO>{

	public ProductsDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductsDTO productsDTO = new ProductsDTO();
		productsDTO.setId_product(rs.getInt("id_product"));
		productsDTO.setId_brand(rs.getInt("id_brand"));
		productsDTO.setPrice(rs.getInt("price"));
		productsDTO.setName(rs.getString("name"));
		productsDTO.setDetail(rs.getString("detail"));
		productsDTO.setImg(rs.getString("img"));
		productsDTO.setSale_prd(rs.getBoolean("sale_prd"));
		productsDTO.setNew_prd(rs.getBoolean("new_prd"));
		productsDTO.setBest_prd(rs.getBoolean("best_prd"));
		productsDTO.setSize(rs.getInt("size"));
		
		return productsDTO;
	}
	

	
}
