package week3_day3.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExercise {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("./a_file.txt");

        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println("file = " + file);
        }
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
