package week4_day2.read_line_parser.Parser;

import week4_day2.read_line_parser.domain.Hospital;

public class HospitalParser implements Parser<Hospital>{

    @Override
    public Hospital parse(String str) {

        String[] split = str.split(",");
        return new Hospital(split[0]);
    }
}
