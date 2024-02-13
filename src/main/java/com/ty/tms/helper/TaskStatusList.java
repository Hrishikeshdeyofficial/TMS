package com.ty.tms.helper;

import java.util.List;

import javax.persistence.Query;

import com.ty.tms.entity.Task;

public class TaskStatusList {

	public static List<Task> getTaskList()
	{
		String query_statement = "SELECT t FROM Task t ORDER BY t.status";
		Query query = Connections.manager.createQuery(query_statement);
		
		List<Task> taskList = query.getResultList();
		return taskList;
	}
}
