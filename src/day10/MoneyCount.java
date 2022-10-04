package day10;

import java.util.Scanner;

public class MoneyCount {
    public static void main(String[] args) {
        int money;

        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 넣어주세요: ");

        money = sc.nextInt();

        int a = (money / 50000);
        int b = (money % 50000) / 10000;
        int c = (money % 10000) / 5000;
        int d = (money % 5000) / 1000;
        int f = (money % 1000) / 500;
        int g = (money % 500) / 100;
        int h = (money % 100) / 50;
        int i = (money % 50) / 10;

        System.out.println("50000원 " + a + "장");
        System.out.println("10000원 " + b + "장");
        System.out.println("5000원 " + c + "장");
        System.out.println("1000원 " + d + "장");
        System.out.println("500원 " + f + "개");
        System.out.println("100원 " + g + "개");
        System.out.println("50원 " + h + "개");
        System.out.println("10원 " + i + "개");
    }
}
