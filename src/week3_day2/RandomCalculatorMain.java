package week3_day2;

public class RandomCalculatorMain {
    public static void main(String[] args) {

        RandomCalculator rc = new RandomCalculator(10);
        int b = (int)(Math.random()*10);

        rc.plus();
        rc.minus();
        rc.multiple();
        rc.divide();

    }
}
