package ProtoTypePattern.main;

public class Dog extends Animal {
    private int parseLoudness;

    public Dog(String name, int size, String color, int parseLoudness) {
        super(name, size, color);
        this.parseLoudness = parseLoudness;
    }

    @Override
    protected Dog clone() throws CloneNotSupportedException {
        return new Dog(super.getName(), super.getSize(), super.getColor(), this.parseLoudness);
    }

    public int getParseLoudness() {
        return this.parseLoudness;
    }
}