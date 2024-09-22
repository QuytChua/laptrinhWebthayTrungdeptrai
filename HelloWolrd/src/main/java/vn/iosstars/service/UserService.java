package vn.iosstars.service;

import java.sql.Date;

import vn.iosstar.dao.UserDao;
import vn.iosstar.models.UserModel;
public class UserService implements IUserservice {
	UserDao userDao = new UserDao();

	@Override
	public UserModel login(String username, String password) {
		UserModel user = this.get(username);
		if (user != null && password.equals(user.getPassword())) {
			return user;
		}
		return null;
	}

	@Override
	public UserModel get(String username) {
		return userDao.get(username);
	}

	@Override
	public boolean checkExistUsername(String username) {
		return userDao.checkExistUsername(username);
	}

	@Override
	public boolean checkExistEmail(String email) {
		return userDao.checkExistEmail(email);
	}

	@Override
	public boolean register(String username, String password, String email, String fullname, String phone) {
		long millis = System.currentTimeMillis();
		Date currentDate = new java.sql.Date(millis);
		 UserModel user = new UserModel();
         user.setEmail(email);
         user.setUsername(username);
         user.setFullname(fullname);
         user.setPassword(password);
         user.setImages("Mac Dinh");
         user.setRoleid(1);
         user.setPhone(phone);
         user.setCreateDate(currentDate);
		try {
			userDao.insert(user); 
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
