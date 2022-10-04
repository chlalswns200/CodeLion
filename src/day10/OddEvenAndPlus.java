package day10;

import java.util.Scanner;

public class OddEvenAndPlus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        if (numA % 2 == 0) {
            System.out.print("짝수+");
        } else {
            System.out.print("홀수+");
        }

        if (numB % 2 == 0) {
            System.out.print("짝수=");
        } else {
            System.out.print("홀수=");
        }

        if ((numA + numB) % 2 == 0) {
            System.out.print("짝수");
        } else {
            System.out.print("홀수");
        }
    }
}
