public class Bai5 {
  public static boolean mang(int[] arr, int a) {
      for (int n : arr) {
         if (a == n) {
            return true;
         }
      }
      return false;
   }
   public static void main(String[] args) {
          int[] array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2265, 1457, 2456};
      System.out.println(mang(array1, 2013));
      System.out.println(mang(array1, 2015));
   }
}