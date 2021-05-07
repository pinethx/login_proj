package login_proj.dto;

public class UserDto {
	private int userNo;
	private String id;
	private String passwd;
	private String email;

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserDto(int userNo, String id, String passwd, String email) {
		super();
		this.userNo = userNo;
		this.id = id;
		this.passwd = passwd;
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDto [userNo=" + userNo + ", id=" + id + ", passwd=" + passwd + ", email=" + email + "]";
	}

	public UserDto(String id) {
		super();
		this.id = id;
	}

}
