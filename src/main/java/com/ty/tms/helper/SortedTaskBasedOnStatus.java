package com.ty.tms.helper;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ty.tms.entity.Task;

public class SortedTaskBasedOnStatus {

	public static List<Task> sortTask(List<Task> tasks)
	{
	
	
	Collections.sort(tasks, (task1, task2)-> task2.getStatus().compareTo(task1.getStatus()));
	return tasks;
	}
}
