package codeUp;

import java.util.Scanner;

public class CodeUp1044 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB =sc.nextInt();

        System.out.println(numA+numB);

        System.out.println(numA-numB);

        System.out.println(numA*numB);

        System.out.println(numA/numB);

        System.out.println(numA%numB);

        System.out.printf("%.2f",numA/(double)numB);

    }
}