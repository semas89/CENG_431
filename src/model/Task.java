package model;
import java.util.Calendar;


public class Task extends Effort {
	
	private Integer resourceID;
	private Activity activity;
	
	public Task(Integer number, String desc,Calendar startDate, Integer hours) {
		super(number, desc, startDate, hours);
	}

	public Task(Integer number, String desc,Calendar startDate, 
			Integer hours,Integer resourceID, Activity activity) {
		super(number, desc, startDate, hours);
		this.resourceID = resourceID;
		this.activity = activity;
	}

	public Integer getResourceID() {
		return resourceID;
	}

	public void setResourceID(Integer resourceID) {
		this.resourceID = resourceID;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	
}
