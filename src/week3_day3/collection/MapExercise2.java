package week3_day3.collection;

import java.util.HashMap;

public class MapExercise2 {
    public static void main(String[] args) {

        String repoAddr = "https://github.com/chlalswns200/CodeLion";

        HashMap<String,Integer> hashMap = new HashMap<>();

        for (int i = (int) 'a'; i <= (int) 'z'; i++) {
            int cnt = 0;
            for (int j = 0; j < repoAddr.length(); j++) {
                if (i == repoAddr.charAt(j)) {
                    cnt++;
                }
            }
            String str = String.valueOf((char) i);
            hashMap.put(str,cnt);
        }

        for (int i = (int) 'A'; i <= (int) 'Z'; i++) {
            int cnt = 0;
            for (int j = 0; j < repoAddr.length(); j++) {
                if (i == repoAddr.charAt(j)) {
                    cnt++;
                }
            }
            String str = String.valueOf((char) i);
            hashMap.put(str,cnt);
        }
        System.out.println("hashMap = " + hashMap);

    }
}
