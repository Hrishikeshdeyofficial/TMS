package com.ty.tms.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.ty.tms.entity.Task;
import com.ty.tms.entity.UserInfo;
import com.ty.tms.helper.Connections;

public class TaskDao {

	public static void addTaskToEmployee(String employeeDescription, int employeeId, String employeeStatus)
	{
		Task task = new Task();
		task.setDescription(employeeDescription);
		task.setStatus(employeeStatus);
		
		UserInfo user = Connections.manager.find(UserInfo.class, employeeId);
		
		
		
		List<Task> taskLists = user.getTasks();
		taskLists.add(task);
		user.setTasks(taskLists);
		
		Connections.transaction.begin();
		Connections.manager.persist(task);
		Connections.transaction.commit();
		
		Connections.transaction.begin();
		Connections.manager.merge(user);
		Connections.transaction.commit();
		
	}
	
	public static Task updateTaskOfEmployee(int task_id)
	{
		Task task = Connections.manager.find(Task.class, task_id);
		task.setStatus("Completed");
		
		Connections.transaction.begin();
		Connections.manager.merge(task);
		Connections.transaction.commit();
		
		return task;
	}
	
}
