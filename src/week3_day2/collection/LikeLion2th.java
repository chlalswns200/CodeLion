package week3_day2.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {

    private List<String> students = new ArrayList<>();
    private List<Student> studentsAll = new ArrayList<>();

    public LikeLion2th() {
        Names names = new Names();
        students = names.names();  // 이름 list 만 생성
        studentsAll = names.studentObj(); // 이름 반 깃허브 주소

    }
    // 멋사 2기 학생의 이름이 들어있는 list를 return 하는 method

    public List<String> getStudentList() {
        return this.students;
    }

    public List<Student> getStudentsAll() {
        return this.studentsAll;
    }
}
