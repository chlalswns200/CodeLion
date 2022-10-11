package codeUp;

import java.util.Scanner;

public class CodeUp1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int real = 0;
        while (true) {
            sum = 0;
            while (num>0) {
                sum += num%10;
                num /= 10;
            }
            if (sum >= 10) {
                num = sum;
            } else {
                real = sum;
                break;
            }
        }
        System.out.println(real);
    }
}