package Question_1;

public class Tester {
    public static void main(String[] args) {
        Student student = new Student("Muiz",1999,"Software Engineering");
        Person person = new Person("Muiz",1999);
        Instructor instructor = new Instructor("Muiz",1999,100000);
        System.out.println(student.toString()+", "+person.toString()+", "+instructor.toString());
    }
}
