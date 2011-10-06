package model;
import java.util.ArrayList;
import java.util.Calendar;


public class Activity extends Effort{

	private String deliverable;
	private Project project;
	private ArrayList<Task> taskList;
	
	public Activity(Integer number, String desc, Calendar startDate,
			Integer hours) {
		super(number, desc, startDate, hours);
	}

	public void addTask(Task task) {
		if(task.getActivity().equals(this) && !taskList.contains(task) )
			taskList.add(task);
		
	}

	public String getDeliverable() {
		return deliverable;
	}

	public void setDeliverable(String deliverable) {
		this.deliverable = deliverable;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public ArrayList<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(ArrayList<Task> taskList) {
		this.taskList = taskList;
	}
	
}
