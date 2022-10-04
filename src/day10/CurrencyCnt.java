package day10;

import java.util.Scanner;

public class CurrencyCnt {
    public static void main(String[] args) {
        int amount = 0;
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 넣으세요: ");
        amount = sc.nextInt();

        while (true) {

            if (amount - 50000 >= 0) {
                amount -= 50000;
                a += 1;
            } else {
                break;
            }
        }
        System.out.println("50000원" + a + "개");
        while (true) {

            if (amount - 10000 >= 0) {
                amount -= 10000;
                b += 1;
            } else {
                break;
            }
        }
        System.out.println("10000원" + b + "개");
        while (true) {

            if (amount - 5000 >= 0) {
                amount -= 5000;
                c += 1;
            } else {
                break;
            }
        }
        System.out.println("5000원" + c + "개");
        while (true) {

            if (amount - 1000 >= 0) {
                amount -= 1000;
                d += 1;
            } else {
                break;
            }
        }
        System.out.println("1000원" + d + "개");
        while (true) {

            if (amount - 1000 >= 0) {
                amount -= 1000;
                d += 1;
            } else {
                break;
            }
        }
        System.out.println("1000원" + d + "개");
        while (true) {

            if (amount - 500 >= 0) {
                amount -= 500;
                e += 1;
            } else {
                break;
            }
        }
        System.out.println("500원" + e + "개");

        while (true) {

            if (amount - 100 >= 0) {
                amount -= 100;
                f += 1;
            } else {
                break;
            }
        }
        System.out.println("100원" + f + "개");

        while (true) {

            if (amount - 50 >= 0) {
                amount -= 50;
                g += 1;
            } else {
                break;
            }
        }
        System.out.println("50원" + g + "개");

        while (true) {

            if (amount - 10 >= 0) {
                amount -= 10;
                h += 1;
            } else {
                break;
            }
        }
        System.out.println("50원" + h + "개");
    }
}
