package vn.iosstar.models;

import java.io.Serializable;
import java.sql.Date;
public class UserModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2822920344027752642L;
	private int id;
	private String username;
	private String email;
	private String fullname;
	private String images;
	private Date createDate;
	private int roleid;
	private String phone;
	private String password;
	
	public UserModel() {
		super();
	}

	public UserModel(int id, String username, String email, String fullname, String images, Date createDate, int roleid,
			String phone, String password) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.fullname = fullname;
		this.images = images;
		this.createDate = createDate;
		this.roleid = roleid;
		this.phone = phone;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
