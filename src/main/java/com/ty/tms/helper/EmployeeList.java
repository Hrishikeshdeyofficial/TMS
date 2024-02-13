package com.ty.tms.helper;

import java.util.List;

import javax.persistence.Query;
import com.ty.tms.entity.UserInfo;

public class EmployeeList {

	public static List<UserInfo> getEmployeeList()
	{
		 String query = "SELECT u FROM UserInfo u WHERE u.userRole NOT IN('Manager')";
		 Query q = Connections.manager.createQuery(query);
		 List<UserInfo> userLists = q.getResultList();
	     return userLists;
	}
}
