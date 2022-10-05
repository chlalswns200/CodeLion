package week3_day2.calV2;

public class RandomNumberGenerator implements NumberGenerator{

    @Override
    public int generate(int num) {
        return (int) (Math.random() * 10);
    }
}
