import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by adm on 29.11.2017.
 */
public class Lab09Task4488 {
    public static void main(String[] args) {


        for (int i = 1; i <= 6; i++)

        {
            File target = new File("resource/task4488/test" + i + ".txt");
            int count = 0;
            int f = 0;
            if (!target.exists()) {
                System.out.println("Файл не найден" + target.getAbsolutePath());

            }
                try {
                    Scanner s = new Scanner(target);
                    if (s.hasNext()) {
                         f++;
                        System.out.println(s.nextLine());
                    }
                    while (s.hasNext()) {
                        s.nextLine();
                        count++;

                    }
                    if (f<1){
                        System.out.println("Файл пуст");
                    }
                    if (f>0) {
                        System.out.println(count);
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("Файл не найден");
                }
            }

    }
}