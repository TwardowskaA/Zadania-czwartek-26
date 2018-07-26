public class Test {

    public static void main(String[] args) {


        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Jan", "Kowalski", 2300);
        employees[1] = new Director("Aneta", "Kowalska", 5400.45, 230);


        for (Person emp : employees) {
            emp.show();

        }

        double sum = 0;

        for (Employee employee : employees)
        sum = sum + employee.totalSalary();

        System.out.println("\nSuma wypłat:" + sum);
    }
}
