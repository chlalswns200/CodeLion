package codeUp;

import java.util.Scanner;

public class CodeUp1048 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int answer = 1;
        for (int i = 0; i < numB; i++) {
            answer = answer*2;
        }
        System.out.println(numA*answer);
    }
}