public class SalariedEmployee extends Employee{
    //Fields, States, Instance Variables
    private double salary;

    //Constructor
    public SalariedEmployee(String name, HireDate hireDate, double salary) {
        super(name, hireDate);
        this.salary = salary;
    }

    //Getter
    public double getSalary() {
        return salary;
    }

    //Setter
    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }

    @Override
    public boolean isPayable(Person person) {
        return true;
    }

    @Override
    public double calculatePay() {
        return salary;
    }
}
