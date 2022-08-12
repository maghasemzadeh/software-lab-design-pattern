package AbstractFactoryPattern.main;

public class IranianTree implements AbstractTree {
    private String name;
    private int height;
    private int leafSize;

    public IranianTree(String name, int height, int leafSize) {
        this.name = name;
        this.height = height;
        this.leafSize = leafSize;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLeafSize() {
        return this.leafSize;
    }

    public void setLeafSize(int leafSize) {
        this.leafSize = leafSize;
    }
}
