import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Lab09Task5537 {
    public static void main(String[] args) {
for (int i = 1; i <= 6; i++){
    File target = new File("resource/task5537/test" + i + ".txt");
    int count = 0;
    if (!target.exists()) {
        System.out.println("Файл не найден" + target.getAbsolutePath());

    }
    try {
        Scanner s = new Scanner(target);

        while (s.hasNext()) {

            String stroka = s.nextLine();
            if (stroka.length() > 4){
                System.out.println("Запись длиннее четырех символов");
            }


                }

} catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
}
    }
}
