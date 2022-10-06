package week3_day3.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {

    public void printFiles() {
        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println("file = " + file);
        }
    }
    public char readChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }

    public String read2Chars(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;
    }

    public String readNChars(String filename,int size) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        for (int i = 0; i < size;i++) {
            str +=(char) fileReader.read();
        }
        return str;
    }
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("./a_file.txt");
        FileExercise fileExercise = new FileExercise();
        char c = fileExercise.readChar("./a_file.txt");
        String s = fileExercise.read2Chars("./a_file.txt");
        String sN = fileExercise.readNChars("./a_file.txt",5);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
        System.out.println("sN = " + sN);
        
    }
    /*
    "C:\Program Files\Java\jdk-9.0.4\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2021.3.2\lib\idea_rt.jar=6896:C:\Program Files\JetBrains\IntelliJ IDEA 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\chlal\Desktop\Spring study\coderion\out\production\coderion" week3_day3.file.FileExercise
file = .\.git
file = .\.gitignore
file = .\.idea
file = .\a_file.txt
file = .\coderion.iml
file = .\data
file = .\out
file = .\src

Process finished with exit code 0

     */
}
