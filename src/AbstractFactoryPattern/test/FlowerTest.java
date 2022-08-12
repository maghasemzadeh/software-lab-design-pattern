package AbstractFactoryPattern.test;

import AbstractFactoryPattern.main.IranianFlower;
import AbstractFactoryPattern.main.JapeneseFlower;
import AbstractFactoryPattern.main.IranianTree;
import AbstractFactoryPattern.main.JapeneseTree;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlowerTest {
    @Test
    public void IranianFlowerCreationTest() {
        String name = "Laleh";
        int petalCount = 4;
        int petalSize = 10;
        IranianFlower flower = new IranianFlower(name, petalCount, petalSize);

        assertEquals(flower.getName(), name);
        assertEquals(flower.getPetalCount(), petalCount);
        assertEquals(flower.getPetalSize(), petalSize);
    }

    @Test
    public void JapaneseFlowerCreationTest() {
        String name = "jlower";
        String fruit = "jruit";
        JapeneseFlower flower = new JapeneseFlower(name, fruit);

        assertEquals(flower.getName(), name);
        assertEquals(flower.getFruit(), fruit);
    }

    @Test
    public void IranianFlowerSetNameTest() {
        String name = "Laleh";
        int petalCount = 4;
        int petalSize = 10;
        IranianFlower flower = new IranianFlower(name, petalCount, petalSize);

        String newName = "Nastaran";
        flower.setName(newName);

        assertEquals(flower.getName(), newName);
    }

    @Test
    public void JapaneseFlowerSetNameTest() {
        String name = "jlower";
        String fruit = "jruit";
        JapeneseFlower flower = new JapeneseFlower(name, fruit);

        String newName = "new_jlower";
        flower.setName(newName);

        assertEquals(flower.getName(), newName);
    }
}