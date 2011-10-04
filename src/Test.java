import java.util.Calendar;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		cal1.set(1998, Calendar.MARCH, 2);
		Effort task1 = new Task(1,"Code Solution",cal1,40);
		cal1.set(1998, Calendar.MARCH, 16);
		Effort task2 = new Task(2,"Test Solution",cal1,40);
		
		Effort activity1 = new Activity();
		Effort activity2 = new Activity();

		task1.setActivity(activity1);
		task2.setActivity(activity1);
		
		activity1.addTask(task1);
 		activity2.addTask(task1); 
 		// hata vermesi lazım her task bir activity'de bulunmalı
 		// task1.getActivity().equals(this) ?  return error : addTask
 		activity1.addTask(task2);
 		
 		
 		
 		
	}

}
