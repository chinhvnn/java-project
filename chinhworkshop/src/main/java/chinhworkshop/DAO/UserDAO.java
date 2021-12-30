package chinhworkshop.DAO;

import org.springframework.stereotype.Repository;

import chinhworkshop.Entity.User_mapper;
import chinhworkshop.Entity.User_setget;

@Repository
public class UserDAO extends BaseDAO{
	
	//get user login
	public User_setget GetDataUserByEmail(User_setget user) {
		String sql = "SELECT * FROM users WHERE email = "+"'"+user.getEmail()+"'";
		User_setget list = new User_setget();
		list = _jbdcTemplate.queryForObject(sql, new User_mapper());//sua lai loi nay
		return list;
	}
	
	//add user regiter into data sql
	public int AddUser(User_setget user) {
	StringBuffer  sql_adduser = new StringBuffer();
	sql_adduser.append("INSERT INTO users ( ");
	sql_adduser.append("user_name, ");
	sql_adduser.append("email, ");
	sql_adduser.append("password, ");
	sql_adduser.append("address) ");
	sql_adduser.append(" ");
	sql_adduser.append("VALUES ( ");
	sql_adduser.append(" '"+user.getUser_name()+"', ");
	sql_adduser.append(" '"+user.getEmail()+"', ");
	sql_adduser.append(" '"+user.getPassword()+"', ");
	sql_adduser.append(" '"+user.getAddress()+"')");
	
	int ins = _jbdcTemplate.update(sql_adduser.toString());// thuc hien lenh va tra ve kieu int
	
	return ins;
	}
}
