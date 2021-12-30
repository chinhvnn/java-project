//lay danh sach du lieu ra, thi phai co cai hung du lieu nay.
package chinhworkshop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Slides_mapper implements RowMapper<Slides_setget> {

	public Slides_setget mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Slides_setget Slides_setget = new Slides_setget();
		Slides_setget.setId(rs.getInt("id"));
		Slides_setget.setImg(rs.getString("img"));
		Slides_setget.setCaption(rs.getString("caption"));
		Slides_setget.setLink(rs.getString("link"));
		return Slides_setget;
	}
	

}
