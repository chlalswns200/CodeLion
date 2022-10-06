package week3_day3.collection;

public class AlphabetGenerator implements Generator{

    @Override
    public Character generate() {
        int rndNum = (int) (Math.random()*26);
        char alphabet = (char) (rndNum + 65);
        return alphabet;
    }
}
