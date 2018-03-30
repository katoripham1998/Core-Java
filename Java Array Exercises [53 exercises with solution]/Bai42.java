import java.util.*;
import java.lang.*;
class bai42
{
   public static void main (String[] args) 
    {  
        int so[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
        int i,  nums_size = nums.length;
        int i = 0, j = nums_size - 1;
        
        System.out.println("Mang bau dau : "+Arrays.toString(so));  
 
        while (i < j) 
        {
            while (so[i] == 0 && i < j)
               i++;
 
            while (so[j] == 1 && i < j)
                j--;
 
           
            if (i < j) 
            {
                so[i] = 0;
                so[j] = 1;
                i++;
                j--;
            }
        }
        
       System.out.println("mang sau khi sap xep : "+Arrays.toString(so));  
    }
}
