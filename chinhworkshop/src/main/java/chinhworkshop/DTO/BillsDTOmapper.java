package chinhworkshop.DTO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BillsDTOmapper implements RowMapper<BillsDTO>{

	public BillsDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BillsDTO billsDTO = new BillsDTO();
		billsDTO.setId_bill(rs.getInt("id_bill"));
		billsDTO.setUser_id(rs.getInt("id_user"));
		billsDTO.setUser_name(rs.getString("user_name"));
		billsDTO.setPhone(rs.getString("phone"));
		billsDTO.setAddress(rs.getString("address"));
		billsDTO.setTotalPriceBill(rs.getInt("totalPriceBill"));
		billsDTO.setNote(rs.getString("note"));
		billsDTO.setDate_time(rs.getString("date_time"));
		
		return billsDTO;
	}
	

	
}
