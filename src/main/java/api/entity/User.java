package api.entity;

import java.util.Date;

/**
 * @author Aung Kyaw Oo
 *
 */
public class User {
    /**
     * id
     */
    public int id;
    /**
     * name
     */
    public String name;
    /**
     * email
     */
    public String email;
    /**
     * password
     */
    public String password;
    /**
     * profile
     */
    public String profile;
    /**
     * type
     */
    public int type;
    /**
     * phone
     */
    public int phone;
    /**
     * address
     */
    public String address;
    /**
     * dob
     */
    public Date dob;
    /**
     * create_user_id
     */
    public int create_user_id;
    /**
     * updated_user_id
     */
    public int updated_user_id;
    /**
     * deleted_user_id
     */
    public int deleted_user_id;
    /**
     * remember_token
     */
    public String remember_token;
    /**
     * created_at
     */
    public Date created_at;
    /**
     * updated_at
     */
    public Date updated_at;
    /**
     * deleted_at
     */
    public Date deleted_at;
	/**
	 * @return int
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return String
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return String
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return String
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return String
	 */
	public String getProfile() {
		return profile;
	}
	/**
	 * @param profile
	 */
	public void setProfile(String profile) {
		this.profile = profile;
	}
	/**
	 * @return int
	 */
	public int getType() {
		return type;
	}
	/**
	 * @param type
	 */
	public void setType(int type) {
		this.type = type;
	}
	/**
	 * @return int
	 */
	public int getPhone() {
		return phone;
	}
	/**
	 * @param phone
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}
	/**
	 * @return String
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return Date
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @return int
	 */
	public int getCreate_user_id() {
		return create_user_id;
	}
	/**
	 * @param create_user_id
	 */
	public void setCreate_user_id(int create_user_id) {
		this.create_user_id = create_user_id;
	}
	/**
	 * @return int
	 */
	public int getUpdated_user_id() {
		return updated_user_id;
	}
	/**
	 * @param updated_user_id
	 */
	public void setUpdated_user_id(int updated_user_id) {
		this.updated_user_id = updated_user_id;
	}
	/**
	 * @return int
	 */
	public int getDeleted_user_id() {
		return deleted_user_id;
	}
	/**
	 * @param deleted_user_id
	 */
	public void setDeleted_user_id(int deleted_user_id) {
		this.deleted_user_id = deleted_user_id;
	}
	/**
	 * @return String
	 */
	public String getRemember_token() {
		return remember_token;
	}
	/**
	 * @param remember_token
	 */
	public void setRemember_token(String remember_token) {
		this.remember_token = remember_token;
	}
	/**
	 * @return Date
	 */
	public Date getCreated_at() {
		return created_at;
	}
	/**
	 * @param created_at
	 */
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	/**
	 * @return Date
	 */
	public Date getUpdated_at() {
		return updated_at;
	}
	/**
	 * @param updated_at
	 */
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	/**
	 * @return Date
	 */
	public Date getDeleted_at() {
		return deleted_at;
	}
	/**
	 * @param deleted_at
	 */
	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}
    
}
