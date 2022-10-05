package day11.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likelion2th = new LikeLion2th();
        List<String> students = likelion2th.getStudentList();

        for (String student : students) {
            System.out.println("student = " + student);
        }
    }
}
