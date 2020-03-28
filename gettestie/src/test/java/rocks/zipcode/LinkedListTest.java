package java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {
    LinkedList<Person> linkedList;

    @Test
    public void addPersonTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person1 = new Person("Jeffery", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");

        linkedList.add(person);
        linkedList.add(person1);

        Assert.assertEquals(2, linkedList.size());
    }

    @Test
    public void removePersonTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person1 = new Person("Jeffery", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person2 = new Person("Jefferia", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person3 = new Person("Jeffaria", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");

        linkedList.add(person);
        linkedList.add(person1);
        linkedList.add(person2);
        linkedList.add(person3);

        linkedList.remove(person2);

        Assert.assertEquals(3, linkedList.size());
    }
}
