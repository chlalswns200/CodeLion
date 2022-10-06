package week3_day3.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExercise2 {
    public static void main(String[] args) {
        AlphabetGenerator alphabetGenerator = new AlphabetGenerator();
        Character generate = alphabetGenerator.generate();

        System.out.println("generate = " + generate);

        List<Character> listA = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            listA.add(alphabetGenerator.generate());
        }

        System.out.println("listA = " + listA);
        System.out.println("listA.size() = " + listA.size());
        
        Set<Character> setA = new HashSet<>(listA);
        System.out.println("setA = " + setA);
        System.out.println("setA.size() = " + setA.size());
    }
}
