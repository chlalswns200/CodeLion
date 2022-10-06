package codeUp;

import java.util.Scanner;

public class CodeUp1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.print("["+str.charAt(i));
            for (int j = str.length() - i; j > 1; j--) {
                System.out.print("0");
            }
            System.out.println("]");
        }

    }
}