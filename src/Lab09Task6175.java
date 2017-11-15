import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by adm on 15.11.2017.
 */
public class Lab09Task6175 {
    public static void main(String[] args) {
       for ( int i = 1; i<=6; i++) {
           File target = new File("resource/task6175/test" + i + ".txt");

       /* if (!target.exists()){
            System.out.println("Файл не найден" + target.getAbsolutePath());
            return;
        }
        */

           try {
               Scanner s = new Scanner(target);
               if (s.hasNext()) {
                   System.out.print(s.nextLine());
               }
               while (s.hasNext()) {
                   System.out.print(", ");
                   System.out.print(s.nextLine());
               }
               System.out.println();

           } catch (FileNotFoundException e) {
               System.out.println("Файл не найден");
           }
       }
    }
}
