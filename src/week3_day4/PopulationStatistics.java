package week3_day4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {

        Map<String,Integer> moveCntMap = new HashMap<>();

        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if (moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
    }

    public Map<String, Integer> heatmapIdxMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("11",0);
        map.put("26",1);
        map.put("27",2);
        map.put("28",3);
        map.put("29",4);
        map.put("30",5);
        map.put("31",6);
        map.put("36",7);
        map.put("41",8);
        map.put("42",9);
        map.put("43",10);
        map.put("44",11);
        map.put("45",12);
        map.put("46",13);
        map.put("47",14);
        map.put("48",15);
        map.put("50",16);
        return map;
    }

    public static void main(String[] args) throws IOException {

        //String address = "C:\\Users\\chlal\\Desktop\\인구이동조사\\2021_인구관련연간자료.csv";
        String address = "./from_to.txt";

        PopulationStatistics ps = new PopulationStatistics();

        List<PopulationMove> pml = ps.readByLine(address);

        Map<String, Integer> map = ps.getMoveCntMap(pml);
        Map<String, Integer> heatMapIdxMap = ps.heatmapIdxMap();

        String targetFilename = "for_heatmap.txt";
        ps.createAFile(targetFilename);
        List<String> cntResult = new ArrayList<>();
        for (String key : map.keySet()) {
            String[] fromto = key.split(",");
            // 매핑을 해서 저장
            String s = String.format("[%s, %s, %d],\n", heatMapIdxMap.get(fromto[0]), heatMapIdxMap.get(fromto[1]), map.get(key));
            cntResult.add(s);
//            System.out.printf("key:%s value:%d\n", key, map.get(key));
        }
        ps.write(cntResult, targetFilename);



    }
}