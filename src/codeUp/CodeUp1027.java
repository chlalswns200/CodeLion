package codeUp;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] split = str.split("\\.");

        for (int i = split.length-1; i >= 0; i--) {
            System.out.print(split[i]);
            if (i != 0) {
                System.out.print("-");
            }
        }
        
    }
}