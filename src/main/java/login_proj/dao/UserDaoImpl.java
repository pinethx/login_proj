package login_proj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import login_proj.dto.UserDto;

public class UserDaoImpl implements UserDao {
	private Connection con;
	private static UserDaoImpl instance = new UserDaoImpl();

	public static UserDaoImpl getInstance() {
		return instance;
	}

	private UserDaoImpl() {

	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	@Override
	public UserDto selectLoginUser(String id, String passwd) {
		String sql = "select id from users where id = ? and passwd = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			if(rs.next()) {
				return getLoginUser(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	private UserDto getLoginUser(ResultSet rs) {
		String id;
		try {
			id = rs.getString("id");
			return new UserDto(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
