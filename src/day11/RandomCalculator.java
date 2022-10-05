package day11;

public class RandomCalculator {

    int a;
    public RandomCalculator(int a) {
        this.a = a;
    }

    public void plus(int b) {
        System.out.println(a+b);
    }
    public void minus(int b) {

        System.out.println(a-b);
    }
    public void multiple(int b) {

        System.out.println(a*b);
    }
    public void divide(int b) {
        if (b == 0) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        } else {
            System.out.println(a/(float)b);
        }

    }
}
