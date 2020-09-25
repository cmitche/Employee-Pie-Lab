import java.util.Comparator;

public class PeopleComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        if(person1.calculatePay() > person2.calculatePay()){
            return 1;
        }
        return -1;
    }
}
