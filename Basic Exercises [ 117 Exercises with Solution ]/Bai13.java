public class Bai13 {
 
   public static void main(String[] strings) {

        double cr = 5.6;
        double cd = 8.5;

        double cv = 2*(cd + cr);
		
        double dt = cr * cd;			
		
		System.out.printf("Chu vi la 2*(%.1f + %.1f) = %.2f \n", cd, cr, cv);

        System.out.printf("Dien tich la %.1f * %.1f = %.2f \n", cd, cr, cv);
    }
}