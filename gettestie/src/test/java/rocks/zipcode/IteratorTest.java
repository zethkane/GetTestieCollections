package java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class IteratorTest {
    Iterator<Person> iterator;

    @Test
    public void addPersonTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person1 = new Person("Jeffery", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");


        Assert.assertFalse(iterator.hasNext());
    }
}
