package Question_1;

public class Person {
    public String name;
    public int yearOfBirth;
    Person(String name, int yearOfBirth){
        super();
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
