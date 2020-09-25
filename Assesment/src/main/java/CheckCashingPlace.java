import java.util.ArrayList;

public class CheckCashingPlace {
    public static void main(String[] args) {
        //Create an Entrepreneur Object
        Entrepreneur chris = new Entrepreneur("Chris", 20000.0);

        //Create a SalariedEmployee Object
        HireDate jamesHireDate = new HireDate(12, 12, 2010);
        SalariedEmployee james = new SalariedEmployee("James", jamesHireDate, 1000.0);

        //Create an HourlyEmployee Object
        HireDate mikeHireDate = new HireDate(7, 9, 2016);
        HourlyEmployee mike = new HourlyEmployee("Mike", mikeHireDate, 10.00, 40);

        //Create an instance of the HumanResources class
        HumanResources humanResources = new HumanResources();

        //Create an array of people that are Payable
        Person[] payablePeople = {james, mike, chris};

        //Create an array of Employees that are payable
        Employee[] payableEmployees = {james, mike};

        //Invoke the issueBadge method that takes an array of employees
        humanResources.issueBadge(payableEmployees);


        //Print out the text - “Prior to sorting by pay..”
        System.out.println("Prior to sorting by pay..");

        //Invoke the payPerson method that takes an array of people
        humanResources.payPerson(payablePeople);

        //Initialize a new ArrayList of payable People called unSortedPeople;
        ArrayList<Person> unsortedPeople = new ArrayList<>();

        //Add your Entrepreneur Object plus the Salaried and Hourly Employee instances to your list.
        unsortedPeople.add(chris);
        unsortedPeople.add(james);
        unsortedPeople.add(mike);

        //Print out a blank line.
        System.out.println();

        //Finally, invoke your sortPeopleByIncome method which accepts your list of unsortedPeople
        System.out.println("After sorting by pay..");
        humanResources.sortPeopleByIncome(unsortedPeople);
    }
}
