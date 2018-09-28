package com.petifee.persistence;

import com.petifee.domain.UserVO;

public interface UserDAO {
	public String getTime();
	
	public void insertUser(UserVO vo);
	
	public UserVO readUser(String uid) throws Exception;
	
	public UserVO readWithPw(String uid, String upw) throws Exception;
}
