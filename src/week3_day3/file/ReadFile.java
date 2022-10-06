package week3_day3.file;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    String readLine() throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );

        String line;
        line = br.readLine();
        return line;
    }

    List<String> readNLine(int n) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );

        String line;
        List<String> lines = new ArrayList<>();

        line = br.readLine();
        for (int i = 0; i < n; i++) {
            lines.add(line);
        }
        return lines;
    }

    List<String> readAllLine() throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );

        String line;
        List<String> lines = new ArrayList<>();
        
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("a_file.txt");
        List<String> strings = readFile.readAllLine();

        String oneLine = readFile.readLine();
        System.out.println("--라인 1줄--");
        System.out.println(oneLine);



        List<String> stringsN = readFile.readNLine(2);
        System.out.println("--N 라인--");
        for (String s : stringsN) {
            System.out.println(s);
        }

        List<String> stringsA = readFile.readAllLine();
        System.out.println("--전체 라인--");
        for (String s : stringsA) {
            System.out.println(s);
        }


    }
}
