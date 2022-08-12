package AbstractFactoryPattern.main;

public class IranianGardenCreator implements AbstractGardenCreator {
    
    public AbstractTree createTree() {
        return new IranianTree("Parrotia", 10, 3);
    }

    public AbstractFlower createFlower() {
        return new IranianFlower("Nilofar", 25, 5);
    }
}