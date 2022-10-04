package day10;

import java.util.Scanner;

public class MoneyCount {
    public static void main(String[] args) {



        int refund = 25000;

        System.out.printf("5만원권 %d장 나머지:d\n",refund/50000,refund%50000);

        System.out.printf("1만원권 %d장 나머지:d\n",refund/10000,refund%10000);

        System.out.printf("5000원권 %d장 나머지:d\n",refund/10000,refund%5000);
    }
}
