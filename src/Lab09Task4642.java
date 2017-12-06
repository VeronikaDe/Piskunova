import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab09Task4642 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            File target = new File("resource/task4642/test" + i + ".txt");
            int count = 0;
            if (!target.exists()) {
                System.out.println("Файл не найден" + target.getAbsolutePath());

            }

            try {
                Scanner s = new Scanner(target);

                while (s.hasNext()) {

                    String stroka = s.nextLine();

                    String[] arr = stroka.split(" ");
                    count += arr.length;
                    for (int j=0; j<arr.length;j++){
                        if (arr[j].equals("")){
                           count--;
                        }
                    }


                }
                System.out.println(count);
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден");
            }
            }
        }
    }

