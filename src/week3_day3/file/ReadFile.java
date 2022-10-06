package week3_day3.file;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    private String filename;

    public ReadFile(String filename) {
        this.filename = filename;
    }

    char readOneBtye() throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );

        String line;
        while ((line = br.readLine()) != null) {
            return line.charAt(0);
        }
        return ' ';
    }

    String readNBtye(int num) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );

        String line;
        while ((line = br.readLine()) != null) {
            return line.substring(0, num);
        }
        return " ";
    }

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("a_file.txt");
        String c = readFile.readNBtye(3);
        System.out.println("c = " + c);



    }
}
