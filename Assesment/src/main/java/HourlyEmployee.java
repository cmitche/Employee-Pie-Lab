public class HourlyEmployee extends Employee {
    //Instance Variables
    private double hourlyRate;
    private int hoursWorked;

    //Constructor
    public HourlyEmployee(String name, HireDate hireDate, double hourlyRate, int hoursWorked) {
        super(name, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    //Methods
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public boolean isPayable(Person person) {
        return true;
    }
}
