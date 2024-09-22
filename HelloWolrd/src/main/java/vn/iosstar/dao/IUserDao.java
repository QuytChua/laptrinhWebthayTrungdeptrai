package vn.iosstar.dao;
import vn.iosstar.models.UserModel;

public interface IUserDao {

	void insert(UserModel user);
	UserModel get(String username);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	boolean checkExistPhone(String phone);
	
}
