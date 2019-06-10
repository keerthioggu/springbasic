package com.springs;

import java.util.List;

import com.springframeworrk.Test1;

public interface DaoLogin {
	public List<Test1> getTest1ByUserNameAndpwd(String username, String password);
	public List<Test1> getAllUsers();
}
