package AbstractFactoryPattern.main;

public class JapeneseFlower implements AbstractFlower {
    private String name;
    private String fruit;

    public JapeneseFlower(String name, String fruit) {
        this.name = name;
        this.fruit = fruit;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFruit() {
        return this.fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }
}
