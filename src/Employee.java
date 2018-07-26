public class Employee extends Person {

    private double salary;

    public Employee(String firstname, String lastName, double salary) {
        super(firstname, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public void show() {
        super.show();
        System.out.println(salary + " ");
    }


}
