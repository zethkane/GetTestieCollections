package java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {
    ArrayDeque<Person> arrayDeque;

    @Test
    public void addPersonTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        arrayDeque.add(person);

        Assert.assertEquals(1 , arrayDeque.size());
    }

    @Test
    public void removePersonTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person1 = new Person("Jeffery", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");

        arrayDeque.add(person);
        arrayDeque.add(person1);
        arrayDeque.remove(person1);

        Assert.assertEquals(1, arrayDeque.size());
    }
}
