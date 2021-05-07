package login_proj.dao;

import login_proj.dto.UserDto;

public interface UserDao {
	UserDto selectLoginUser(String id, String passwd);
}
