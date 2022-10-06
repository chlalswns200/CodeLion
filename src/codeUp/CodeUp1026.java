package codeUp;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] split = str.split(":");

        if (split[1].equals("00")) {
            System.out.println("0");
        } else {
            System.out.println(split[1]);
        }

    }
}