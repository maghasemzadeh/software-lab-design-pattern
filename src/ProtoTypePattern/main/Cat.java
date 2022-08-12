package ProtoTypePattern.main;

public class Cat extends Animal {
    private int furSize;

    public Cat(String name, int size, String color, int furSize) {
        super(name, size, color);
        this.furSize = furSize;
    }

    @Override
    protected Cat clone() throws CloneNotSupportedException {
        return new Cat(super.getName(), super.getSize(), super.getColor(), this.furSize);
    }

    public int getfurSize() {
        return this.furSize;
    }
}