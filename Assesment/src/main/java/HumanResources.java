import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HumanResources  {
    public void issueBadge(Employee[] employee){
        for(Employee x : employee){
            //System.out.println("Hello " + x.getName() + ", here is your badge!");
            x.printBadge(x);
            System.out.println();
        }
    }

    public void printPaymentInfo(Person person){
        System.out.println(person.getName() + "should be paid: $" + person.calculatePay());
    }

    public void payPerson(Person[] people){
        for(Person person : people){
            System.out.println(person.getName() + " has been paid: $" + person.calculatePay());
        }
    }

    public void sortPeopleByIncome(ArrayList<Person> payablePeople){
        Collections.sort(payablePeople, new PeopleComparator());
        for(Person person : payablePeople){
            System.out.println(person.getName() + " has been paid: $" + person.calculatePay());
        }
    }
}
