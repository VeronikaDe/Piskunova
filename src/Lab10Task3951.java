import java.awt.*;
import java.io.*;
import java.util.Scanner;

/**
 * Created by adm on 17.01.2018.
 */
public class Lab10Task3951 {
    public static void main(String[] args) {
        String filename = "out/task3951.html";

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(filename,"utf-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int w = s.nextInt();
        int h = s.nextInt();
        int sw = 2;
        writer.println ("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"utf-8\"/>\n" +
                "<head/>\n" +
                "<body>\n" +
                "<h1>Мой первый векторный рисунок</h1>\n" +
                "\n" +
                "<svg width=\"800\" height=\"600\">\n" +
                "\t<rect x=\"" + x + "\" y=\"" + y + "\" width=\"" + w + "\" height=\"" + h + "\" stroke=\"blue\" stroke-width=\"" + sw + "\" fill=\"red\" />\n" +
                "</svg>\n" +
                "</body>\n" +
                "</html>");
        writer.close();
        try {
            Desktop.getDesktop().open(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
