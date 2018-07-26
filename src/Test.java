public class Test {

    public static void main(String[] args) {


        Person[] employees = new Person[2];
        employees[0] = new Employee("Jan", "Kowalski", 2300);
        employees[1] = new Director("Aneta", "Kowalska", 5400.45, 230);


        for (Person emp : employees) {
        emp.show();

        }

        double sum = 0;

        for (Person employee: employees){
            if( employee instanceof Employee) {
                sum = sum + ((Employee) employee).getSalary();
            } else if(employee instanceof Director) {
                sum = sum + ((Director)employee).getSalary() + ((Director)employee).getBonus();
            }
        }
        System.out.println("\nSuma wypłat:" + sum);
    }
}
