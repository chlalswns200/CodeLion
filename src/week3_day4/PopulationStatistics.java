package week3_day4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatistics {
    public void readByChar(String fileName) throws IOException {

        // 1byte 씩 읽기
        FileReader fileReader = new FileReader(fileName);
        String fileContents ="";

        while (fileContents.length() < 50){
            char c = (char)fileReader.read();
            fileContents += c;
        }

        System.out.println(fileContents);

    }

    //요즘 스타일
    public void readByLine2(String fileName) {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //////////////////////////////////////////////////////////////////

    public List<PopulationMove> readByLine(String fileName) throws IOException {

        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(fileName)
        );
        String str;

        while ((str = reader.readLine()) != null) {
            PopulationMove pm = parse(str);
            pml.add(pm);
        }

        reader.close();
        return pml;
    }

    public PopulationMove parse(String data){
        String[] parseArr = data.split(",");
        return new PopulationMove(parseArr[0], parseArr[1]);    //전입 to, 전출 from
    }

    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //List<String>을 지정한 파일에 write
    public void write(List<String> strs, String filename) {
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
            for (String str : strs){
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";

    }

    public static void main(String[] args) throws IOException {

        //String address = "C:\\Users\\chlal\\Desktop\\인구이동조사\\2021_인구관련연간자료.csv";
        String address = "./from_to.txt";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(address);

        for (PopulationMove pm : pml){
            System.out.printf("전입:%s, 전출:%s \n", pm.getFromSido(), pm.getToSido());
        }
    }
}