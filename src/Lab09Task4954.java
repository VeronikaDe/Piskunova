import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab09Task4954 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            File target = new File("resource/task4954/test" + i + ".txt");
            int count = 0;

            if (!target.exists()) {
                System.out.println("Файл не найден" + target.getAbsolutePath());

            }
            Scanner m = new Scanner (System.in);
            String x = m.nextLine();

            try {
                Scanner s = new Scanner(target);

                while (s.hasNext()) {

                        String stroka = s.nextLine();

                        if(stroka.contains(x)){
                            count++;

                    }
                }
                System.out.println(count);
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден");
            }
            }
        }
    }

