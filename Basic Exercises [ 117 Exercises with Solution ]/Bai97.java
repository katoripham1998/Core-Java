import java.util.*; 
import java.io.*; 
 public class Bai97 {
 public static void main(String[] args)
 {
	  int[] array_so = {10, 20, 10, 5, 16, 50};
      boolean testd = false;
	  int result=0;
	  int x = 10;
	      
	for(int i = 0; i < array_so.length - 1; i++) {
        if(array_so[i] == x && array_so[i+1] == x)
            {
         System.out.printf( String.valueOf(true));	
         result = 1 ;
		}
                  
        if(i <= array_so.length - 3 && array_so[i] == x && array_so[i+2] == x)
           {
         System.out.printf( String.valueOf(true));	
         result = 1 ;
		}
    }
	
	 if (result==0)                             
	   {	 
         System.out.printf( String.valueOf(false));
	    }
		System.out.printf("\n");
    }
}