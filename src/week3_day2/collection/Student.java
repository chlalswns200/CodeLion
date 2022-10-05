package week3_day2.collection;

public class Student {

    private String name;
    private int classNumber;
    private String gitRepository;

    public String getName() {
        return name;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public String getGitRepository() {
        return gitRepository;
    }

    public Student(String name, int classNumber, String gitRepository) {
        this.name = name;
        this.classNumber = classNumber;
        this.gitRepository = gitRepository;
    }
}
