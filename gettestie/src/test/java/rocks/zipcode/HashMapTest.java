package java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {
    HashMap<String, Person> personHashMap;

    @Test
    public void addPersonTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person1 = new Person("Jeffery", 1995);
        person.setAddress("Jeff Ave", "Jefferson", "12345");

        personHashMap.put(person.getName(),person);
        personHashMap.put(person1.getName(), person1);

        Assert.assertEquals(2, personHashMap.size());
    }

    @Test
    public void removePersonTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person1 = new Person("Jeffery", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");

        personHashMap.put(person.getName(), person);
        personHashMap.put(person1.getName(), person);
        personHashMap.remove(person1.getName());


        Assert.assertEquals(1, personHashMap.size());
    }

}
