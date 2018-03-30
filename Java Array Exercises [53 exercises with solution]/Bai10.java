import java.util.Arrays; 
public class Bai10 {
 
  static int max;
  static int min;

    public static void max_min(int my_array[]) {
        max = my_array[0];
        min = my_array[0];
        int len = my_array.length;
        for (int i = 1; i < len - 1; i = i + 1) {
            if(my_array[i]>max) max= my_array[i];
            if(my_array[i]<min) min= my_array[i];
        }
    }

    public static void main(String[] args) {
           int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        max_min(my_array);
        System.out.println(" Mang: "+Arrays.toString(my_array));
        System.out.println(" Gia tri lon nhat trong mang = " + max);
        System.out.println(" Gia tri nho nhat trong mang = " + min);
    }
}