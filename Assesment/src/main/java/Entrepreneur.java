public class Entrepreneur extends Person{
    //Instance Variables
    private double income;

    //Constructor
    public Entrepreneur(String name, double income) {
        super(name);
        this.income = income;
    }

    //Getter
    public double getIncome() {
        return income;
    }

    //Setter
    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public double calculatePay() {
        return income;
    }

    //toString()
    @Override
    public String toString() {
        return "Entrepreneur{" +
                "income=" + income +
                '}';
    }

    @Override
    public boolean isPayable(Person person) {
        return true;
    }
}
