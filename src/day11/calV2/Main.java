package day11.calV2;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        Calculator calculator = new Calculator(numberGenerator);
        calculator.plus(15);
    }
}
