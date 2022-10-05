package day11.calV2;

public class Calculator {

    private NumberGenerator numberGenerator;

    public Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void plus(int a) {
        System.out.println(a + numberGenerator.generate(10));
    }
}
