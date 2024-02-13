package com.ty.tms.helper;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.persistence.Query;

import com.ty.tms.entity.Task;
import com.ty.tms.entity.UserInfo;

public class EmployeeTaskList {

	public static List<Task> getEmployeeTaskList(String userName, String password)
	{
		String query_statement = "SELECT u FROM UserInfo u WHERE u.userName = ?1 and u.userPassword  =?2";
		Query query = Connections.manager.createQuery(query_statement);
		
		query.setParameter(1, userName);
		query.setParameter(2, password);
		
		List<UserInfo> users = query.getResultList();
		List<Task> userTaskList = null;
		for(UserInfo u : users)
		{
			 userTaskList = u.getTasks();
		}
		
		return userTaskList;
	}
}
