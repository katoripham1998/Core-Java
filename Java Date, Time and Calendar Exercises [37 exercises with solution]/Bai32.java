package javaDateTimeandCalendarExercises;

import java.time.LocalDate;
import java.time.Period;

public class Bai32 {
	public static void main(String[] args)
    {
       
        LocalDate pdate = LocalDate.of(1989, 04, 11);
   
        LocalDate now = LocalDate.now();
     
        Period diff = Period.between(pdate, now);
 
     System.out.printf("\nI am  %d years, %d months and %d days old.\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
   }
}
