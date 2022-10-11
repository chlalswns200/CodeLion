package codeUp;

import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB =sc.nextInt();
        int numC =sc.nextInt();
        System.out.println(numA+numB+numC);

        System.out.printf("%.1f",(numA+numB+numC)/(double)3);
    }
}