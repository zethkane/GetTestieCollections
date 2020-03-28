package java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class HashSetTest {
    HashSet<Person> personHashSet;

    @Test
    public void addPersonTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");

        personHashSet.add(person);

        Assert.assertEquals(1, personHashSet.size());
    }

    @Test
    public void removePersonTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person1 = new Person("Jeffery", 1995);
        person.setAddress("JeffJeff Ave", "Jefferson", "12345");

        personHashSet.add(person);
        personHashSet.add(person1);
        personHashSet.remove(person);

        Assert.assertEquals(1, personHashSet.size());
    }
}
