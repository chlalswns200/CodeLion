package week3_day3.collection;

import java.util.HashSet;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {

        Set<Integer> setA = new HashSet<>();

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        for (int i = 0; i < 50; i++) {
            setA.add(randomNumberGenerator.generate(50));
        }
        System.out.println("set = " + setA);

    }
}
