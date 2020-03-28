package java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {
    TreeSet<Person> treeSet;

    @Test
    public void addPersonTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person1 = new Person("Jeffery", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");

        treeSet.add(person);
        treeSet.add(person1);

        Assert.assertEquals(2, treeSet.size());
    }

    @Test
    public void clearPersonTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person1 = new Person("Jeffery", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");

        treeSet.add(person);
        treeSet.add(person1);
        treeSet.clear();

        Assert.assertEquals(0, treeSet.size());
    }
}
