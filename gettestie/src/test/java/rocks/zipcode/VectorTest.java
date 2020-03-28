package java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {
    Vector<Person> vector;

    @Test
    public void addPersonTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person1 = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");

        vector.add(person);
        vector.add(person1);

        Assert.assertEquals(2, vector.size());
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

        vector.add(person);
        vector.add(person1);
        vector.add(person2);
        vector.add(person3);

        vector.remove(person1);

        Assert.assertEquals(3, vector.size());
    }
}
