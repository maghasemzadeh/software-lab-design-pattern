package AbstractFactoryPattern.test;


import AbstractFactoryPattern.main.IranianTree;
import AbstractFactoryPattern.main.JapeneseTree;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TreeTest {
    @Test
    public void IranianTreeCreationTest() {
        String name = "Kaaj";
        int height = 20;
        int leafSize = 11;
        IranianTree tree = new IranianTree(name, height, leafSize);

        assertEquals(tree.getName(), name);
        assertEquals(tree.getHeight(), height);
        assertEquals(tree.getLeafSize(), leafSize);
    }

    @Test
    public void JapaneseTreeCreationTest() {
        String name = "Jtree";
        int height = 35;
        String fruit = "Jruit";
        JapeneseTree tree = new JapeneseTree(name, height, fruit);

        assertEquals(tree.getName(), name);
        assertEquals(tree.getHeight(), height);
        assertEquals(tree.getFruit(), fruit);
    }

    @Test
    public void IranianTreeSetName() {
        String name = "Kaaj";
        int height = 20;
        int leafSize = 11;
        IranianTree tree = new IranianTree(name, height, leafSize);

        String newName = "SagheTalaei";

        tree.setName(newName);
        assertEquals(tree.getName(), newName);
    }

    @Test
    public void IranianTreeSetHeight() {
        String name = "Kaaj";
        int height = 20;
        int leafSize = 11;
        IranianTree tree = new IranianTree(name, height, leafSize);

        int newHeight = 15;

        tree.setHeight(newHeight);
        assertEquals(tree.getHeight(), newHeight);
    }

    @Test
    public void JapaneseTreeSetName() {
        String name = "Jtree";
        int height = 35;
        String fruit = "Jruit";
        JapeneseTree tree = new JapeneseTree(name, height, fruit);

        String newName = "NewJapTree";

        tree.setName(newName);
        assertEquals(tree.getName(), newName);
    }

    @Test
    public void JapaneseTreeSetHeight() {
        String name = "Jtree";
        int height = 35;
        String fruit = "Jruit";
        JapeneseTree tree = new JapeneseTree(name, height, fruit);

        int newHeight = 100;

        tree.setHeight(newHeight);
        assertEquals(tree.getHeight(), newHeight);
    }
}
