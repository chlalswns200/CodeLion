package day11;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int a = 10,b=20;

        cal.plus(a,b);
        cal.minus(a,b);
        cal.multiple(a,b);
        cal.divide(a,b);
    }
}
