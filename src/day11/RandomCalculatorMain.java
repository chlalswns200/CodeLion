package day11;

public class RandomCalculatorMain {
    public static void main(String[] args) {

        RandomCalculator rc = new RandomCalculator(10);
        int b = (int)(Math.random()*10);

        rc.plus(b);
        rc.minus(b);
        rc.multiple(b);
        rc.divide(b);

    }
}
