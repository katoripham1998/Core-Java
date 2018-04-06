package javaDateTimeandCalendarExercises;

import java.time.LocalDate;
import java.time.Month;

public class Bai26 {
	public static void main(String[] args) {
		
		      LocalDate ldt = LocalDate.of(2016, Month.FEBRUARY, 10);
		      Month mn = ldt.getMonth(); 
		      int mnIntValue = mn.getValue(); 
		      int minLength = mn.minLength(); 
		      int maxLength = mn.maxLength(); 
		      Month firstMonthOfQuarter = mn.firstMonthOfQuarter();
		      System.out.println("\nInteger value of the current month: " + mnIntValue);
		      System.out.println("Length of the month: " + minLength);
		      System.out.println("Maximum length of the month: " + maxLength); 
		      System.out.println("First month of the Quarter: " + firstMonthOfQuarter+"\n"); 
		      }
}
