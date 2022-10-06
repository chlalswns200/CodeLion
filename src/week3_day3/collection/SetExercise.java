package week3_day3.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        //set 중복을 허용하지 않는 list
        Set<String> set1 = new HashSet<>();
        set1.add("김경록");
        set1.add("김경록");
        set1.add("김미미");

        Set<Integer> setInteger = new HashSet<>();

        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(3);
        System.out.println(set1);

    }
}
