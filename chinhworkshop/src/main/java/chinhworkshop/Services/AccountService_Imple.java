package chinhworkshop.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chinhworkshop.DAO.UserDAO;
import chinhworkshop.Entity.User_setget;

@Service
public class AccountService_Imple implements AccountService_Interface {

	@Autowired
	private UserDAO userDAO;
	
	public int AddUser(User_setget user) {
//			String email_dbUser = userDAO.GetDataUser(user).getEmail();
//			String email_client = user.getEmail();
//			String user_name_dbUser = userDAO.GetDataUser(user).getUser_name();
//			String user_name_client = user.getUser_name();
//			if (email_client.equals(email_dbUser)  || user_name_client.equals(user_name_dbUser)) {
//				userDAO.AddUser(user);
//				return -1;
//			}
		return userDAO.AddUser(user);
	}
	
	//check login
	public User_setget CheckLogin(User_setget user) {
		System.out.println("check email"+user.getEmail());
		User_setget user2 = userDAO.GetDataUserByEmail(user);  //user nay la user da lay tu DB
		System.out.println("2");
		if (user2 != null) {
			String pass_client = user2.getPassword(); /// pass nhap tu client
			String pass_dbUser = userDAO.GetDataUserByEmail(user).getPassword();/// pass phia Database sever
			if (pass_client.equals(pass_dbUser)) {
				return user2;
			}
		}
		return  null;
	}
	
	//lay info
//		public ArrayList<String> profile(User_setget user) {
//			ArrayList<String> info = new ArrayList<String>();
//			String name_dbUser = userDAO.GetDataUser(user).getUser_name();/// user phia Database sever
//			String add_dbUser = userDAO.GetDataUser(user).getAddress();/// user phia Database sever
//			info.add(name_dbUser);
//			info.add(add_dbUser);
//			return info;
//		}

}
