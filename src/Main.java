import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String args[]) {

        try (FileWriter writer = new FileWriter("C:\\Users\\motry\\Desktop\\sport.txt", true)) {
            String text = "ivan 1 \t john 2\t andry 3 ";
            writer.write(text);
            String doptext = " angelina";
            writer.write(doptext);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
        func();
    }

    public static void func() {
        try (FileReader reader = new FileReader("C:\\Users\\motry\\Desktop\\sport.txt")) {
            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
