package week3_day4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PopulationStatisticsMy {

    public void readFileByCharacter(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        //java는 read 메서드를 사용할때만 글자를 읽는다

        String fileContents = "";
        while (fileContents.length() < 10) {
            char read = (char)fileReader.read();
            fileContents +=read;
        }
        System.out.println("fileContents = " + fileContents);

    }
    public void readFileByLine(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();
    }

    public void readFileByLineV2(String fileName) {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8
        )) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PopulationMoveMy parse(String data) {
        String[] split = data.split(",");
        return new PopulationMoveMy(Integer.parseInt(split[0]),Integer.parseInt(split[6]));
    }

    public List<PopulationMoveMy> readAndParse(String fileName) {
        List<PopulationMoveMy> parseData = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8
        )) {
            String line;
            while ((line = br.readLine()) != null) {
                PopulationMoveMy parse = parse(line);
                parseData.add(parse);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return parseData;
    }

    private HashMap<Integer, Integer> SeoulToAny(List<PopulationMoveMy> populationMoves) {
        HashMap<Integer,Integer> seoulToAny = new HashMap<>();
        for (PopulationMoveMy populationMove : populationMoves) {
            seoulToAny.put(populationMove.getToSido(), 0);
        }
        for (PopulationMoveMy populationMove : populationMoves) {
            if (populationMove.getFromSido() == 11) {
                seoulToAny.put(populationMove.getToSido(),seoulToAny.get(populationMove.getToSido())+1);
            }
        }
        return seoulToAny;
    }

    private void findMaxCityAndCount(HashMap<Integer, Integer> seoulToAny) {
        int maxCnt = 0;
        int maxCity = 0;

        for (Integer integer : seoulToAny.keySet()) {
            if (integer > maxCity) {
                maxCity = integer;
            }
        }
        for (Integer value : seoulToAny.values()) {
            if (value > maxCity) {
                maxCnt = value;
            }
        }
        System.out.println("maxCity = " + maxCity);
        System.out.println("maxCnt = " + maxCnt);
    }

    public void createAFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Users\\chlal\\Desktop\\인구이동조사\\2021_인구관련연간자료.csv";
        PopulationStatisticsMy populationStatisticsMy = new PopulationStatisticsMy();

        //populationStatistics.readFileByLine(fileName);
        List<PopulationMoveMy> populationMoves = populationStatisticsMy.readAndParse(fileName);

        HashMap<Integer, Integer> seoulToAny = populationStatisticsMy.SeoulToAny(populationMoves);

        System.out.println("seoulToAny = " + seoulToAny);

        populationStatisticsMy.findMaxCityAndCount(seoulToAny);

        /*
        출력
        seoulToAny = {36=3746, 41=182995, 42=17014, 11=809201, 43=12121, 44=16964, 45=12449, 46=11010, 47=14546, 48=15844, 50=7272, 26=18039, 27=12774, 28=28402, 29=9368, 30=12229, 31=6024}
        maxCity = 50
        maxCnt = 6024

        tetst
         */
        populationStatisticsMy.createAFile("./from_to.txt");


    }
}
