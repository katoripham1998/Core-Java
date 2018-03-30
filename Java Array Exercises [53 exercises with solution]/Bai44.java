import java.util.*;
import java.lang.*;
class bai44
{
   public static void main (String[] args) 
    {  
        int so[] = {6, 7, 9, 16, 25, 12, 30, 40};
        int n = nums.length;
        System.out.println("Mang dau tien : "+Arrays.toString(so));  

        Arrays.sort(so);
        
        int ctr = 0;
 
        for (int i = 0; i < n-2; ++i)
        {
          int x = i + 2;
 
          for (int j = i+1; j < n; ++j)
            {
               while (x < n && so[i] + so[j] > so[x])
               ++x;
                 ctr += x - j - 1;
            }
        }
    System.out.println("Tong so hinh tam giac:  " +ctr);
    }
}
