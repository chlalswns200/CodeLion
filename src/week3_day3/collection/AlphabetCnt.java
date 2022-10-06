package week3_day3.collection;

public class AlphabetCnt {

    public static boolean isAlphabet(char a) {
        if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s1 = "aabbcc!ddefghijkAAAZZ!Zkkkklm";

        for (int i = 0; i < s1.length(); i++) {
            if (isAlphabet(s1.charAt(i))) {
                System.out.println(s1.charAt(i)+"는 알파벳 입니다.");
            } else {
                System.out.println(s1.charAt(i)+"는 알파벳이 아닙니다.");
            }
        }
    }
}
