import java.util.Arrays;
public class bai18 {
  public static void main(String[] args) {

    int[] my_array = {-1, 4, 0, 2, 7, -3};
    System.out.println("Mang dau tien : "+Arrays.toString(my_array));
    int min = Integer.MAX_VALUE;
    int second_min = Integer.MAX_VALUE;
    for (int i = 0; i < my_array.length; i++) {
        if(my_array[i]==min){
          second_min=min;
        } else if (my_array[i] < min) {
            second_min = min;
            min = my_array[i];
        } else if (my_array[i] < second_min) {
            second_min = my_array[i];
        }

    }
    System.out.println("So thap nhat thu hai la : " + second_min);
    }
}
