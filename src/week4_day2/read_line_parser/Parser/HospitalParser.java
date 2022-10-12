package week4_day2.read_line_parser.Parser;

import week4_day2.read_line_parser.domain.Hospital;


public class HospitalParser implements Parser<Hospital>{

    public String setDistrict(String str) {
        String[] s = str.split(" ");
        return s[0] + " " + s[1];
    }
    public String getRealValue(String str) {
        return str.substring(1, str.length() - 1);
    }

    @Override
    public Hospital parse(String str) {
        HospitalParser hospitalParser = new HospitalParser();

        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            split[i] = hospitalParser.getRealValue(split[i]);
            split[i] = split[i].replace("'", "\\");
        }
        for (String s : split) {
            s.replace("'", "\"");
        }

        return new Hospital(split[0], split[1],
                hospitalParser.setDistrict(split[1]),
                split[2], Integer.parseInt(split[6]),
                split[10],null);
    }
}
