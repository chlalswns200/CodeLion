package codeUp;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.replaceAll("[^a-zA-Z_0-9]", "");
        System.out.println(str);

    }
}