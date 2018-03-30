public class bai13 {
public static void main(String[] args) 
    {
        String[] mang = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
 
        for (int i = 0; i < mang.length-1; i++)
        {
            for (int j = i+1; j < mang.length; j++)
            {
                if( (mang[i]==mang[j]) && (i != j) )
                {
                    System.out.println("Thanh phan trung lap la : "+mang[j]);
                }
            }
        }
    }    
}
