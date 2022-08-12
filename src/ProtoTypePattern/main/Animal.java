package ProtoTypePattern.main;

import java.lang.Cloneable;

public class Animal implements Cloneable {
    private String  name;
    private int size;
    private String color;

    Animal(String name, int size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public String getColor() {
        return this.color;
    }
}