package codeUp;

import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split("\\.");

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                for (int j = 0; j < 4 - split[i].length(); j++) {
                    System.out.print("0");
                }
                System.out.print(split[i]);
            } else {
                if (split[i].length() == 1) {
                    System.out.print(".0" + split[i]);
                } else {
                    System.out.print("." + split[i]);
                }
            }
        }
    }
}