package week3_day3.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {

        Set<Integer> setA = new HashSet<>();
        List<Integer> listA = new ArrayList<>();

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        //랜덤 숫자 생성
        for (int i = 0; i < 10; i++) {
            int generate = randomNumberGenerator.generate(10);
            System.out.println("generate = " + generate);
        }
        
        //set에 바로 넣기
        for (int i = 0; i < 50; i++) {
            setA.add(randomNumberGenerator.generate(50));
        }
        System.out.println(setA);
        
        //list로 받은 후 중복제거
        for (int i = 0; i < 50; i++) {
            listA.add(randomNumberGenerator.generate(50));
        }
        System.out.println(listA);
        System.out.println(listA.size());

        Set<Integer> setB = new HashSet<>(listA);

        System.out.println("setB = " + setB);
        System.out.println("setB.size() = " + setB.size());
        
        
    }
}
