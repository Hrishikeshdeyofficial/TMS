package com.ty.tms.dao;

import com.ty.tms.entity.UserInfo;
import com.ty.tms.helper.Connections;

public class UserDAO {

	
	
	public static UserInfo addUserDetails(UserInfo user) {

			Connections.transaction.begin();
			Connections.manager.persist(user);
			Connections.transaction.commit();
			System.out.println("\n\n Details Added \n");
			
			return user;
			 
			
	}
	
	

}
