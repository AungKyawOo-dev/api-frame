package api.resources;

/**
 * @author Aung Kyaw Oo
 *
 */
public class LoginForm {

	/**
	 * userName
	 */
	private String userName;

	/**
	 * password
	 */
	private String password;

	/**
	 * accessToken
	 */
	private String accessToken;

	/**
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return
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
	 * @return
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * @param accessToken
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * @return String
	 */
	@Override
	public String toString() {
		return "LoginResource{userName: " + this.userName + ",accessToken: " + this.accessToken + ",password: "
				+ this.password + "}";
	}
}
