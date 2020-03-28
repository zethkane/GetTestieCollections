package java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {
    TreeMap<String, Person> treeMap;

    @Test
    public void addPersonTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person1 = new Person("Jeffery", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");

        treeMap.put(person.getName(), person);
        treeMap.put(person1.getName(), person);

        Assert.assertEquals(2, treeMap.size());
    }

    @Test
    public void removePersonTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person1 = new Person("Jeffery", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");

        treeMap.put(person.getName(), person);
        treeMap.put(person1.getName(), person);
        treeMap.remove(person.getName());

        Assert.assertEquals(1, treeMap.size());
    }
}
