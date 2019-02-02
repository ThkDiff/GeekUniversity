package Generics.BigTask;

public class Apple extends Fruit {
    private String type;

    public Apple(float weight, String type) {
        super(weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
