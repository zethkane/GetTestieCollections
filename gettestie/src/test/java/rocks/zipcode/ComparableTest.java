package java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class ComparableTest {
    Comparable<Person> comparable;

    @Test
    public void addPersonTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person1 = new Person("Jeffery", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");

        comparable.compareTo(person1);
    }
}
