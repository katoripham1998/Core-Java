import java.util.Arrays; 
public class bai15 {
public static void main(String[] args) 
    {
      int[] mang1 = {1, 2, 5, 5, 8, 9, 7, 10};
      int[] mang2 = {1, 0, 6, 15, 6, 4, 7, 0};
 
       System.out.println("Mang 1 la : "+Arrays.toString(array1));
       System.out.println("Mang 2 la : "+Arrays.toString(array2));
 
      
        for (int i = 0; i < mang1.length; i++)
        {
            for (int j = 0; j < mang2.length; j++)
            {
                if(mang1[i] == (mang2[j]))
                {
                 
                 System.out.println("Common element is : "+(mang1[i]));
                 }
            }
        }
 
    }
}
