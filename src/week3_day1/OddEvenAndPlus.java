package week3_day1;

import java.util.Scanner;

public class OddEvenAndPlus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        OddEven(numA);
        System.out.print("+");
        OddEven(numB);
        System.out.print("=");
        OddEven(numA+numB);
    }

    private static void OddEven(int numA) {
        if (numA % 2 == 0) {
            System.out.print("짝수");
        } else {
            System.out.print("홀수");
        }
    }
}
