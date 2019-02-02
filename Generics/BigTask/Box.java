package Generics.BigTask;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private String name;
    private float weightOfBox;
    private ArrayList<T> box = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getWeightOfBox() {
        return weightOfBox;
    }

    public void add(T t1, int numberOfFruits){
        for (int i =0; i < numberOfFruits;i++)
            box.add(t1);
    }

    public void countWeight(){
        float localForWeight = 0.0f;
        for (T t : box)
            localForWeight += t.getWeight();
        weightOfBox = localForWeight;
    }

    public boolean compare(Box<? extends Fruit> box){
        if (this.weightOfBox == box.getWeightOfBox())
            return true;
        return false;
    }

    public void moveFriuts(Box<T> anotherBox){
        anotherBox.box.addAll(this.box);
        this.box.clear();
    }

    public <T extends Apple>String formatForApples(T t){
        return this.name + " of " + t.getType();
    }

    public <T extends Orange>String formatForOranges(T t){
        return this.name + " of " + t.getType();
    }
}

