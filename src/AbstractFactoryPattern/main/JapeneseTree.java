package AbstractFactoryPattern.main;

public class JapeneseTree implements AbstractTree {
    private String name;
    private int height;
    private String fruit;

    public JapeneseTree(String name, int height, String fruit) {
        this.name = name;
        this.height = height;
        this.fruit = fruit;
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

    public String getFruit() {
        return this.fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }
}
