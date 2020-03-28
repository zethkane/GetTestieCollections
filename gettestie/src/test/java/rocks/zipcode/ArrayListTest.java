package java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    ArrayList<Person> personArray;

    @Test
    public void personAddTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");

        personArray.add(person);

        Assert.assertEquals(1, personArray.size());
    }

    @Test
    public void personRemoveTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person1 = new Person("Jeff", 1995);
        person.setAddress("JeffJeff Ave", "Jefferson", "12345");

        personArray.add(person1);
        personArray.add(person);
        personArray.remove(person1);
        Assert.assertEquals(1, personArray.size());
    }

}
