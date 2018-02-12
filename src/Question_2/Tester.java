package Question_2;

public class Tester {
    public static void main(String[] args) {
        Employee employee = new Employee("Muiz",1000);
        Manager manager = new Manager("Muiz",10000,"IT");
        Executive executive = new Executive("Muiz",10000,"IT");
        System.out.println(employee.toString()+", "+manager.toString()+", "+executive.toString());
    }
}
