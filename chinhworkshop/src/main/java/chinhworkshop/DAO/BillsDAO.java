package chinhworkshop.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import chinhworkshop.DTO.BillsDTO;
import chinhworkshop.DTO.BillsDTOmapper;

@Repository
public class BillsDAO extends BaseDAO {

	// ADD BILL	// ///////////////////////////////////////////////////////////////////////////////////////////
	
	public int AddBill(BillsDTO bill) {
		StringBuffer  sql_addbill = new StringBuffer();
		sql_addbill.append("INSERT INTO bills ( ");
		sql_addbill.append("user_id, ");
		sql_addbill.append("user_name, ");
		sql_addbill.append("phone, ");
		sql_addbill.append("address, ");
		sql_addbill.append("totalPrice, ");
		sql_addbill.append("note) ");
		sql_addbill.append(" ");
		sql_addbill.append("VALUES ( ");
		sql_addbill.append(" '"+bill.getUser_id()+"', ");
		sql_addbill.append(" '"+bill.getUser_name()+"', ");
		sql_addbill.append(" '"+bill.getPhone()+"', ");
		sql_addbill.append(" '"+bill.getAddress()+"', ");
		sql_addbill.append(" '"+bill.getTotalPriceBill()+"', ");
		sql_addbill.append(" '"+bill.getNote()+"')");
		
		int ins = _jbdcTemplate.update(sql_addbill.toString());// thuc hien lenh va tra ve kieu int
		
		return ins;
		}
	public List<BillsDTO> GetDataListOrder(int id_user) {
		StringBuffer  sql = new StringBuffer();
		sql.append("SELECT ");
		sql.append("b.id_bill, ");
		sql.append("b.id_user, ");
		sql.append("b.user_name, ");
		sql.append("b.phone, ");
		sql.append("b.address, ");
		sql.append("b.totalPriceBill, ");
		sql.append("b.note, ");
		sql.append("b.date_time, ");
		sql.append("bd.name_product ");
		sql.append("FROM bills AS b ");
		sql.append("INNER JOIN bill_detail AS bd ");
		sql.append("ON b.id_bill = bd.id_bill ");
		sql.append(" ");
		sql.append("WHERE b.id_user = "+id_user);
		
		List<BillsDTO> list = new ArrayList<BillsDTO>();
		list = _jbdcTemplate.query(sql.toString(), new BillsDTOmapper());
		return list;
	}
}
