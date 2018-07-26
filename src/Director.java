public class Director extends Employee {

    private double bonus;

    public Director(String firstname, String lastName, double salary, double bonus) {
        super(firstname, lastName, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(bonus);
    }

    @Override
    public double totalSalary() {
        return getSalary() + bonus;
    }


}

