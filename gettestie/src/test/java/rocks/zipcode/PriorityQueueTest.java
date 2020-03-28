package java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    PriorityQueue<Person> priorityQueue;

    @Test
    public void addPersonTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person1 = new Person("Jeffery", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");

        priorityQueue.add(person);
        priorityQueue.add(person1);

        Assert.assertEquals(2, priorityQueue.size());
    }

    @Test
    public void removePersonTest(){
        Person person = new Person("Jeff", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");
        Person person1 = new Person("Jeffery", 1994);
        person.setAddress("Jeff Ave", "Jefferson", "12345");

        priorityQueue.add(person);
        priorityQueue.add(person1);
        priorityQueue.remove(person1);

        Assert.assertEquals(1, priorityQueue.size());
    }
}
