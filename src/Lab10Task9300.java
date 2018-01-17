import java.awt.*;
import java.io.*;
import java.util.Scanner;

/**
 * Created by adm on 17.01.2018.
 */
public class Lab10Task9300 {
    public static void main(String[] args) {
        String filename = "out/task9300.html";
        try {
            PrintWriter writer = new PrintWriter(filename,"utf-8");
            Scanner s = new Scanner(System.in);
            int cx = s.nextInt();
            int cy = s.nextInt();
            int r = s.nextInt();
            int sw = s.nextInt();
            writer.println ("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" +
                    "<h1>Мой первый векторный рисунок</h1>\n" +
                    "\n" +
                    "<svg width=\"800\" height=\"600\">\n" +
                    "\t<circle cx=\"" + cx + "\" cy=\"" + cy + "\" r=\"" + r + "\" stroke=\"green\" stroke-width=\"" + sw + "\" fill=\"yellow\" />\n" +
                    "</svg>\n" +
                    "</body>\n" +
                    "</html>");
            writer.close();
            Desktop.getDesktop().open(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
