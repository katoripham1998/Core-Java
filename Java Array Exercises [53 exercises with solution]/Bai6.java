public class Bai6 {
       public static int  mang (int[] array, int t) {
        if (array == null) return -1;
        int len = array.length;
        int i = 0;
        while (i < len) {
            if (array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
      System.out.println("Vi tri cua 25 la: " + mang(my_array, 25));
      System.out.println("Vi tri cua 77 la: " + mang(my_array, 77));
       }
}