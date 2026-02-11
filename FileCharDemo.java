import java.io.*;

public class FileCharDemo {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("sample.txt");
        fw.write("Java File Handling using Character Stream");
        fw.close();

        FileReader fr = new FileReader("sample.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}
