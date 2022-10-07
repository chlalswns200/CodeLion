package codeUp;

import java.util.Scanner;

public class CodeUp1031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = Integer.toOctalString(num);
        System.out.println(s);
    }
}