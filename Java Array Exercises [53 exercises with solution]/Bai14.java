import java.util.*;
public class bai14 {
public static void main(String[] args) 
    {
       String[] mang1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
 
       String[] mang2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
       
       System.out.println("Mang 1 : "+Arrays.toString(array1));
       System.out.println("Mang2  : "+Arrays.toString(array2));
 
       HashSet<String> set = new HashSet<String>();
 
        for (int i = 0; i < mang1.length; i++)
        {
            for (int j = 0; j < mang2.length; j++)
            {
                if(mang1[i].equals(array2[j]))
                {
                    set.add(array1[i]);
                }
            }
        }
 
        System.out.println("Common element : "+(set));     //OUTPUT : [THREE, FOUR, FIVE]
    }
}
