package week3_day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics {

    public void readFileByCharacter(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        //java는 read 메서드를 사용할때만 글자를 읽는다

        String fileContents = "";
        while (fileContents.length() < 10) {
            char read = (char)fileReader.read();
            fileContents +=read;
        }
        System.out.println("fileContents = " + fileContents);

    }
    public void readFileByLine(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();
    }

    public void readFileByLineV2(String filePath) {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(filePath), StandardCharsets.UTF_8
        )) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PopulationMove parse(String data) {
        String[] split = data.split(",");
        return new PopulationMove(Integer.parseInt(split[0]),Integer.parseInt(split[6]));
    }

    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\chlal\\Desktop\\인구이동조사\\2021_인구관련연간자료.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        //populationStatistics.readFileByLine(filePath);

        String test = "50,130,54000,2021,07,19,50,130,57000,3,1,061,1,,,,,,,,,,,,,,,,,,,,,,,,,,,,492029";
        PopulationMove parse = populationStatistics.parse(test);
        System.out.println("parse.getFromSido() = " + parse.getFromSido());
        System.out.println("parse.getFromSido() = " + parse.getToSido());


    }
}
