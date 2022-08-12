package ProtoTypePattern.test;

import ProtoTypePattern.main.Dog;
import ProtoTypePattern.main.Cat;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

public class ProtoTest {
    public static Dog dog;
    public static Cat cat;

    @BeforeClass
    public static void beforeClass() {
        dog = new Dog("Happy", 5, "RED", 10);
        cat = new Cat("Jimmy", 2, "BLUE", 20);
    }

    @Test
    public void testDogFieldsCloned() throws CloneNotSupportedException {
        Dog newDog = dog.clone();
        Assert.assertEquals(newDog.getName(), newDog.getName());
        Assert.assertEquals(newDog.getSize(), newDog.getSize());
        Assert.assertEquals(newDog.getColor(), newDog.getColor());
        Assert.assertEquals(newDog.getParseLoudness(), newDog.getParseLoudness());
    }

    @Test
    public void testCatFieldsCloned() throws CloneNotSupportedException {
        Cat newCat = cat.clone();
        Assert.assertEquals(cat.getName(), newCat.getName());
        Assert.assertEquals(cat.getSize(), newCat.getSize());
        Assert.assertEquals(cat.getColor(), newCat.getColor());
        Assert.assertEquals(cat.getfurSize(), newCat.getfurSize());
    }
}