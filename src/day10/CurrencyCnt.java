package day10;

import java.util.Scanner;

public class CurrencyCnt {
    public static void main(String[] args) {
        int amount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 넣으세요: ");
        amount = sc.nextInt();

        int[] currency = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10};
        for (int i : currency) {
            System.out.println(i+ "=" +amount / i);
            amount %= i;
        }


    }
}
