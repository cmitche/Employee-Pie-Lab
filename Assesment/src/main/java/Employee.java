public abstract class Employee extends Person {
    HireDate hireDate;

    public Employee(String name, HireDate hireDate) {
        super(name);
        this.hireDate = hireDate;
    }

    public HireDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(HireDate hireDate) {
        this.hireDate = hireDate;
    }

    public void printBadge(Employee employee){
        System.out.println("Name: " + employee.getName() + "\n" + "Type of employee: " + employee.getClass().getName() + "\n" + "HireDate: " + employee.getHireDate());
    }
}
