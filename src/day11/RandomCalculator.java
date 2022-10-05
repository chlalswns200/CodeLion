package day11;

public class RandomCalculator {

    int a;
    int b;
    public RandomCalculator(int a) {
        this.a = a;
        this.b = (int) (Math.random() * 10);
    }

    public void plus() {
        System.out.println(a+b);
    }
    public void minus() {

        System.out.println(a-b);
    }
    public void multiple() {

        System.out.println(a*b);
    }
    public void divide() {
        if (b == 0) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        } else {
            System.out.println(a/(float)b);
        }

    }
}
