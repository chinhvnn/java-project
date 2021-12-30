package chinhworkshop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Brands_mapper implements RowMapper<Brands_setget> {

	public Brands_setget mapRow(ResultSet rs, int rowNum) throws SQLException {
		Brands_setget Brands_setget = new Brands_setget();
		Brands_setget.setId(rs.getInt("id"));
		Brands_setget.setBrand_name(rs.getString("brand_name"));
		Brands_setget.setBrand_des(rs.getString("brand_des"));
		return Brands_setget;
	}
}
