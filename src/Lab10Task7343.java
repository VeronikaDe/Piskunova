import java.awt.*;
import java.io.*;
import java.util.Scanner;

/**
 * Created by adm on 17.01.2018.
 */
public class Lab10Task7343 {
        public static void main(String[] args) {
            String filename = "out/task7343.html";

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
            int r = s.nextInt();

            writer.println ("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" +
                    "<h1>Мой первый векторный рисунок</h1>\n" +
                    "\n" +
                    "<svg width=\"800\" height=\"600\">\n" +
                    "\t<circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"" + r + "\" fill=\"yellow\" />\n" +
                    "\t<circle cx=\"" + (x+w) + "\" cy=\"" + y + "\" r=\"" + r + "\" fill=\"yellow\" />\n" +
                    "\t<circle cx=\"" + x + "\" cy=\"" + (y+h) + "\" r=\"" + r + "\" fill=\"yellow\" />\n" +
                    "\t<circle cx=\"" + (x+w) + "\" cy=\"" + (y+h) + "\" r=\"" + r + "\" fill=\"yellow\" />\n" +
                    "\t<rect x=\"" + x + "\" y=\"" + y + "\" width=\"" + w + "\" height=\"" + h + "\" fill=\"red\"opacity=\"0.5\" />\n" +
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

