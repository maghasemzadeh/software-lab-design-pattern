package AbstractFactoryPattern.test;

import AbstractFactoryPattern.main.IranianGardenCreator;
import AbstractFactoryPattern.main.JapaneseGardenCreator;
import AbstractFactoryPattern.main.JapeneseFlower;
import AbstractFactoryPattern.main.IranianFlower;
import AbstractFactoryPattern.main.JapeneseTree;
import AbstractFactoryPattern.main.IranianTree;
import AbstractFactoryPattern.main.AbstractTree;
import AbstractFactoryPattern.main.AbstractFlower;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class FactoryTest {

    @Test
    public void IranianFactoryTest() {
        IranianGardenCreator factory = new IranianGardenCreator();

        AbstractTree tree = factory.createTree();
        assertTrue(tree instanceof IranianTree);

        AbstractFlower flower = factory.createFlower();
        assertTrue(flower instanceof IranianFlower);
    }

    @Test
    public void JapaneseFactoryTest() {
        JapaneseGardenCreator factory = new JapaneseGardenCreator();

        AbstractTree tree = factory.createTree();
        assertTrue(tree instanceof JapeneseTree);

        AbstractFlower flower = factory.createFlower();
        assertTrue(flower instanceof JapeneseFlower);
    }
}