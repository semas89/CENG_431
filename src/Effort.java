import java.util.Calendar;

public abstract class Effort {

	private Integer number;
	private String desc;
	private Calendar startDate;
	private Integer hours;
	
	public Effort(Integer number,String desc, Calendar startDate, Integer hours) {
		this.number = number;
		this.desc = desc;
		this.hours = hours;
		this.startDate = startDate;
	}
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public Integer getHours() {
		return hours;
	}
	
	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Effort)){
			return false; 
		}
		Effort effort = (Effort)obj;
		
		return effort.getDesc().equals(getDesc()) &&
			   effort.getHours().equals(getHours()) &&
			   effort.getNumber().equals(getNumber()) &&
			   effort.getStartDate().equals(getStartDate());
	}
	
	@Override
	public int hashCode() {
		
		return 17 * getStartDate().hashCode() + getDesc().hashCode() + getHours().hashCode() + getNumber().hashCode();
	}
	
	@Override
	public String toString() {
		return "Effort [desc=" + desc + ", hours=" + hours + ", number="
				+ number + ", startDate=" + getStartDate().getTime() + "]";
	}

}
