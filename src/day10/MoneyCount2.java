package day10;

import java.util.Scanner;

public class MoneyCount2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] num ={50000,10000,5000,1000,500,100,50,10};

        int refund = 25000;

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;
        int curr10 = 10;

        System.out.print(curr50000+"원 : "+refund/curr50000);
        refund = refund%curr50000;
        System.out.println(" 나머지 금액 :" +refund);

        System.out.print(curr10000+"원 : "+refund/curr10000);
        refund = refund%curr10000;
        System.out.println(" 나머지 금액 :" +refund);

        System.out.print(curr5000+"원 : "+refund/curr5000);
        refund = refund%curr5000;
        System.out.println(" 나머지 금액 :" +refund);

        System.out.print(curr1000+"원 : "+refund/curr1000);
        refund = refund%curr1000;
        System.out.println(" 나머지 금액 :" +refund);

        System.out.print(curr500+"원 : "+refund/curr500);
        refund = refund%curr500;
        System.out.println(" 나머지 금액 :" +refund);

        System.out.print(curr100+"원 : "+refund/curr100);
        refund = refund%curr100;
        System.out.println(" 나머지 금액 :" +refund);

        System.out.print(curr50+"원 : "+refund/curr50);
        refund = refund%curr50;
        System.out.println(" 나머지 금액 :" +refund);

        System.out.print(curr10+"원 : "+refund/curr10);

    }
}
