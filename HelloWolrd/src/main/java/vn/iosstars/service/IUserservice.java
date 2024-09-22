package vn.iosstars.service;

import vn.iosstar.models.UserModel;

public interface IUserservice {
	UserModel login(String username, String password);
    UserModel get(String username);
	boolean register(String username, String password, String email, String fullname, String phone);
	boolean checkExistUsername(String username);
	boolean checkExistEmail(String email);
}
