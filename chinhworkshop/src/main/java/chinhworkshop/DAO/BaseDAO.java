// khai bao thu vien co so dung chung
package chinhworkshop.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class BaseDAO {
	@Autowired
	public JdbcTemplate _jbdcTemplate;
	
	protected StringBuffer sqlSeclectProducts() {
		StringBuffer  sqlProducts = new StringBuffer();
		sqlProducts.append("SELECT ");
		sqlProducts.append("p.id_product, ");
		sqlProducts.append("p.id_brand, ");
		sqlProducts.append("p.sale_prd, ");
		sqlProducts.append("p.new_prd, ");
		sqlProducts.append("p.best_prd, ");
		sqlProducts.append("p.name, ");
		sqlProducts.append("p.detail, ");
		sqlProducts.append("p.img, ");
		sqlProducts.append("p.price, ");
		sqlProducts.append("pp.size ");
		sqlProducts.append("FROM products AS p ");
		sqlProducts.append("INNER JOIN products_pro AS pp ");
		sqlProducts.append("ON p.id_product = pp.id_product");
		return sqlProducts;
		}
}
