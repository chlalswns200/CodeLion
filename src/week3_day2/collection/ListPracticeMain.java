package week3_day2.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {

        LikeLion2th likelion2th = new LikeLion2th();
        List<String> students = likelion2th.getStudentList();
        List<Student> studentsAll = likelion2th.getStudentsAll();

        for (String student : students) {
            System.out.println("student = " + student);
        }

        for (Student student : studentsAll) {
            System.out.println("이름:" + student.getName()+" 반:" + student.getClassNumber()+" 깃허브 리포지토리 :" + student.getGitRepository());
        }
    }
}
