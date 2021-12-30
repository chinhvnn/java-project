package chinhworkshop.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chinhworkshop.Entity.User_setget;
@Service
public interface AccountService_Interface {
	@Autowired
	public User_setget CheckLogin(User_setget user);
	@Autowired
	public int AddUser(User_setget user);

}
