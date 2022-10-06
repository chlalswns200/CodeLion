package week3_day3.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    List<String> students;

    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("김경록");
        this.students.add("김미지");
        this.students.add("최민준");
    }

    public List<String> getStudents() {
        return students;
    }
}
