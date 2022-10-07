package codeUp;

import java.util.Scanner;

public class CodeUp1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        Integer integer = Integer.valueOf(s, 16);
        String s2 = Integer.toOctalString(integer);
        System.out.println(s2);

    }
}