package week3_day2.calV2;

public class Calculator {

    private NumberGenerator numberGenerator;

    private int baseNumber=10;

    public Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public Calculator(NumberGenerator numberGenerator, int num) {
        this.numberGenerator = numberGenerator;
        this.baseNumber = num;
    }

    public void plus(int a) {
        System.out.println(a + numberGenerator.generate(baseNumber));
    }
}
