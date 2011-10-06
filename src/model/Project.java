package model;
import java.util.Calendar;


public class Project {
	private String names;
	private String desc;
	private Calendar Date;

	public Project() {
		// TODO Auto-generated constructor stub
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Calendar getDate() {
		return Date;
	}

	public void setDate(Calendar date) {
		Date = date;
	}

	@Override
	public String toString() {
		return "Project [Date=" + Date.getTime() + ", desc=" + desc + ", names=" + names
				+ "]";
	}
	
	
}
