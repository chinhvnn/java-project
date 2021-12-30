//lay danh sach du lieu ra, thi phai co cai hung du lieu nay.
package chinhworkshop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class User_mapper implements RowMapper<User_setget> {

	public User_setget mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		User_setget User_setget = new User_setget();
		User_setget.setUser_id(rs.getInt("user_id"));
		User_setget.setUser_name(rs.getString("user_name"));
		User_setget.setEmail(rs.getString("email"));
		User_setget.setPassword(rs.getString("password"));
		User_setget.setAdmin(rs.getBoolean("isAdmin"));
		User_setget.setAddress(rs.getString("address"));
		User_setget.setPhone(rs.getString("phone"));
		return User_setget;
	}
	

}
