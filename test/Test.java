import java.util.Calendar;

import model.Activity;
import model.Task;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		cal1.set(1998, Calendar.MARCH, 2);
		Task task1 = new Task(1,"Code Solution",cal1,40);
		Calendar cal2 = Calendar.getInstance();
		cal2.set(1998, Calendar.MARCH, 16);
		Task task2 = new Task(2,"Test Solution",cal2,40);
		
		Activity activity1 = new Activity(3,"Implementation",cal1,100);

		task1.setActivity(activity1);
		task2.setActivity(activity1);
		
		activity1.addTask(task1);
 		// hata vermesi lazım her task bir activity'de bulunmalı
 		// task1.getActivity().equals(this) ?  return error : addTask
 		activity1.addTask(task2);
 		
 		
 		
 		
	}

}
