package day10;

import java.util.Scanner;

public class Multiple {

    static class MultipleModle{
        private int multipleTargetNum = 0;

        public MultipleModle(int multipleTargetNum) {
            this.multipleTargetNum = multipleTargetNum;
        }
        public void isMultiple() {
            if (multipleTargetNum%7 == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("not multiple");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        MultipleModle mpm = new MultipleModle(num);
        mpm.isMultiple();
    }
}
