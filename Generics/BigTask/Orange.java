package Generics.BigTask;

public class Orange extends Fruit {
    private String type;

    public Orange(float weight, String type) {
        super(weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
