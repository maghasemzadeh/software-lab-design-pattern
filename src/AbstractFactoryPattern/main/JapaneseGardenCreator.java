package AbstractFactoryPattern.main;

public class JapaneseGardenCreator implements AbstractGardenCreator {
    
    public AbstractTree createTree() {
        return new JapeneseTree("Maple", 8, "Loquat");
    }

    public AbstractFlower createFlower() {
        return new JapeneseFlower("Cherry", "Loquat");
    }
}