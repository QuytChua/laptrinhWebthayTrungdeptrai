package vn.iosstar.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import vn.iosstar.configs.DBConnection;
import vn.iosstar.models.UserModel;
public class UserDaoImpl implements IUserDao{

	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;
	@Override
	public List<UserModel> findAll() {
		
		return null;
	}

	@Override
	public UserModel findById(int id) {
		String sql = "SELECT * FROM users WHERE id = ? ";
		try {
		conn = new DBConnection().getConnection();
		ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while (rs.next()) {
		UserModel user = new UserModel();
		user.setId(rs.getInt("id"));
		user.setEmail(rs.getString("email"));
		user.setUsername(rs.getString("username"));
		user.setFullname(rs.getString("fullname"));
		user.setPassword(rs.getString("password"));
		user.setRoleid(Integer.parseInt(rs.getString("roleid")));
		user.setPhone(rs.getString("phone"));
		user.setCreateDate(rs.getDate("createdDate"));
		user.setImages(rs.getString("avatar"));
		return user;}
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}

	@Override
	public void insert(UserModel user) {
		
		
	}

	@Override
	public UserModel findByUserName(String username) {
		String sql = "SELECT * FROM users WHERE username = ? ";
		try {
		conn = new DBConnection().getConnection();
		ps = conn.prepareStatement(sql);
		ps.setString(1, username);
		rs = ps.executeQuery();
		while (rs.next()) {
		UserModel user = new UserModel();
		user.setId(rs.getInt("id"));
		user.setEmail(rs.getString("email"));
		user.setUsername(rs.getString("username"));
		user.setFullname(rs.getString("fullname"));
		user.setPassword(rs.getString("password"));
		user.setRoleid(Integer.parseInt(rs.getString("roleid")));
		user.setPhone(rs.getString("phone"));
		user.setCreateDate(rs.getDate("createdDate"));
		user.setImages(rs.getString("avatar"));
		return user;}
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}

}
