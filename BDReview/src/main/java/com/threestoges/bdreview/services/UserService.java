package com.threestoges.bdreview.services;

import java.util.ArrayList;
import java.util.List;

public class UserService {

	public List<String> getUsers(){
		
		List<String> userList = new ArrayList<String>();
		
		userList.add("1 stoges");
		userList.add("2 stoges");
		userList.add("3 stoges");
		
		return userList;
		
	}
	
}
