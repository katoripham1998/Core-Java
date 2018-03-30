import java.util.Arrays;
public class bai17 {
public static void main(String[] args) {
int[] mang = {
            10789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};
System.out.println("mang ban dau : "+Arrays.toString(mang));            
Arrays.sort(mang);
int index = mang.length-1;
while(mang[index]==mang[mang.length-1]){
index--;
}
System.out.println("mang thu 2: " + mang[index]);
}
}