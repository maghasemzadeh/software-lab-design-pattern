package AbstractFactoryPattern.main;

public class IranianFlower implements AbstractFlower {
    private String name;
    private int petalCount;
    private int petalSize;

    public IranianFlower(String name, int petalCount, int petalSize) {
        this.name = name;
        this.petalCount = petalCount;
        this.petalSize = petalSize;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetalCount() {
        return this.petalCount;
    }

    public void setPetalCount(int petalCount) {
        this.petalCount = petalCount;
    }

    public int getPetalSize() {
        return this.petalSize;
    }

    public void setPetalSize(int petalSize) {
        this.petalSize = petalSize;
    }
}
