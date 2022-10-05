package day11;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int a = 6,b=3;

        cal.plus(a,b);
        cal.minus(a,b);
        cal.multiple(a,b);
        cal.divide(a,b);
    }
}
