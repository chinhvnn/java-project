package chinhworkshop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Menus_mapper implements RowMapper<Menus_setget> {

	public Menus_setget mapRow(ResultSet rs, int rowNum) throws SQLException {
		Menus_setget Menus_setget = new Menus_setget();
		Menus_setget.setId(rs.getInt("id"));
		Menus_setget.setName(rs.getString("name"));
		Menus_setget.setLink(rs.getString("link"));
		Menus_setget.setIsSubmenu(rs.getBoolean("isSubmenu"));
		return Menus_setget;
	}
}
