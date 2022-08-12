package AbstractFactoryPattern.main;


public class Client {
    private AbstractGardenCreator gardenCreator;
    private AbstractTree tree;
    private AbstractFlower flower;

    public Client(AbstractGardenCreator factory) {
        this.gardenCreator = factory;
        this.tree = factory.createTree();
        this.flower = factory.createFlower();
    }

    public AbstractGardenCreator getFactory() {
        return this.gardenCreator;
    }

    public void setFactory(AbstractGardenCreator factory) {
        this.gardenCreator = factory;
    }

    public AbstractTree getTree() {
        return this.tree;
    }

    public void setTree(AbstractTree tree) {
        this.tree = tree;
    }

    public AbstractFlower getFlower() {
        return this.flower;
    }

    public void setFlower(AbstractFlower flower) {
        this.flower = flower;
    }
}