public class Bai4 {
public static void main(String[] args) {   
 
       int[] arry = new int[]{20, 30, 25, 35, -16, 60, -100};
       int sum = 0;
       for(int i=0; i < arry.length ; i++)
        sum = sum + arry[i];
        double tb = sum / arry.length;
        System.out.println("Trung binh cong cac phan tu cua mang : " + tb); 
   }
}