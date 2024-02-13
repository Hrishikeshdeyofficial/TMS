package com.ty.tms.helper;

import java.util.List;

import javax.persistence.EntityManager ;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.tms.entity.UserInfo;

public class LoginService {

	public static String loginValidation(String userName, String password)
	{
		String q = "SELECT u FROM UserInfo u WHERE u.userName = ?1 AND u.userPassword = ?2";
		
		Query query = Connections.manager.createQuery(q);
		query.setParameter(1, userName);
		query.setParameter(2, password);
		List<UserInfo> userList = query.getResultList();
		
		if(userList!=null)
		{
			for(UserInfo u: userList)
			{
				if(u.getRole().equals("Manager"))
				{
					return "Manager";
				}
				
				else {
					return "Employee";
				}
			}
			
			
		}
			return null;
		
		
	}
	
	
	
	
}
