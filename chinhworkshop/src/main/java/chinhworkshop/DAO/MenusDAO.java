package chinhworkshop.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import chinhworkshop.Entity.Menus_mapper;
import chinhworkshop.Entity.Menus_setget;

@Repository
public class MenusDAO extends BaseDAO{

	public List<Menus_setget> GetsDataMenus() {
		List<Menus_setget> list = new ArrayList<Menus_setget>();
		String sql= "SELECT * FROM menus";
		list = _jbdcTemplate.query(sql, new Menus_mapper());
		return list;
	}
}
