package Question_1;

public class Student extends Person {
    public String major;
    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                ", name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
