import java.util.Arrays; 
public class Bai9 {
 
public static void main(String[] args) {

   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

   int k = 2;
   int x = 5;

  System.out.println("Mang goc : "+Arrays.toString(my_array));     
   
  for(int i=my_array.length-1; i > k; i--){
    my_array[i] = my_array[i-1];
   }
   my_array[k] = x;
   System.out.println("Mang moi: "+Arrays.toString(my_array));
 }
 }