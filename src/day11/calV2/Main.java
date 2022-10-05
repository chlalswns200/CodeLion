package day11.calV2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new ByPassNumberCreator(),20);
        calculator.plus(20);
    }
}
