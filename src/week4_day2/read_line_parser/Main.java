package week4_day2.read_line_parser;

import week4_day2.read_line_parser.Parser.HospitalParser;
import week4_day2.read_line_parser.domain.Hospital;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        String filename = "C:\\Users\\chlal\\Desktop\\Spring study\\coderion\\서울시 병의원 위치 정보.csv";
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        List<Hospital> hospitals = hospitalLineReader.readLines(filename);
        Writer writer = new Writer();


        String targetFilename = "javaQuery.sql";
        writer.createAFile(targetFilename);

        List<String> queryList = new ArrayList<>();
        queryList.add("INSERT INTO\n");
        queryList.add("`likelion-db`.`seoul_hospital`(`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`)\n");
        queryList.add("VALUES\n");
        for (String s : queryList) {
            System.out.print("s = " + s);

        }
        int i=1;
        for (Hospital hospital : hospitals) {
            if (i != 19039) {
                String s = String.format("('%s','%s','%s','%s', %d ,'%s','%s'),\n",hospital.getId(),hospital.getAddress(),hospital.getDistrict(),
                        hospital.getCategory(),hospital.getEmergencyRoom(),hospital.getName(),hospital.getSubdivision());
                queryList.add(s);

            } else {
                System.out.println("19040 터짐"+i+hospital.getName());
                String s1 = String.format("('%s','%s','%s','%s', %d ,'%s','%s');\n",hospital.getId(),hospital.getAddress(),hospital.getDistrict(),
                        hospital.getCategory(),hospital.getEmergencyRoom(),hospital.getName(),hospital.getSubdivision());
                queryList.add(s1);
            }
            i++;

        }
        System.out.println("i = " + i);
        queryList.add("SELECT * FROM `likelion-db`.seoul_hospital;");
        writer.write(queryList,targetFilename);

    }
}
