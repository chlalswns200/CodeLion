package week3_day3.collection;

import java.util.HashMap;

public class AlphabetCnt {

    public AlphabetCnt() {
    }

    public boolean isAlphabet(char a) {

        if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String s1 = "aabbcc!ddefghijkAAAZZ!Zkkkklm";
        AlphabetCnt alpha = new AlphabetCnt();
        s1 = s1.toUpperCase();
        
        HashMap<Character,Integer> alphabetMap = new HashMap<>();

        for (char c = 'A'; c <= 'Z'; c++) {
            alphabetMap.put(c, 0);
        }

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (alpha.isAlphabet(s1.charAt(i))) {
                alphabetMap.put(c, alphabetMap.get(c) + 1);
            }
        }
        System.out.println("alphabetMap = " + alphabetMap);
    }
}
