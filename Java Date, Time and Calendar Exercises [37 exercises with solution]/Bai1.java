package javaDateTimeandCalendarExercises;

import java.util.Calendar;

public class Bai1 {
	public static void main(String[] args)
    {
     int year = 2018;
     int month = 4;
     int date = 2;

     Calendar cal = Calendar.getInstance();
     cal.clear();
     System.out.println();
     cal.set(Calendar.YEAR, year);
     cal.set(Calendar.MONTH, month);
     cal.set(Calendar.DATE, date);

     System.out.println(cal.getTime());
     System.out.println();
	 }
}
