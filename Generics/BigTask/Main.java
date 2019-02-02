package Generics.BigTask;

public class Main {
    public static void main(String[] args) {
        Box<Apple> boxForApple1 = new Box<>("Box with Apple");
        Box<Apple> boxForApple2 = new Box<>("Box with Apple");
        Box<Orange> boxForOrange1 = new Box<>("Box with Orange");
        Box<Orange> boxForOrange2 = new Box<>("Box with Orange");

        Apple apples1 = new Apple(1.0f,"type1");
        Apple apples2 = new Apple(2.0f,"type2");
        Orange oranges1 = new Orange(1.5f,"type1");
        Orange oranges2 = new Orange(2.5f,"type2");

        boxForApple1.add(apples1,10);
        boxForApple2.add(apples2,8);
        boxForApple1.countWeight();
        boxForApple2.countWeight();
        System.out.println(boxForApple1.formatForApples(apples1) + ": " +
                boxForApple1.getWeightOfBox());
        System.out.println(boxForApple2.formatForApples(apples2) + ": " +
                boxForApple2.getWeightOfBox());

        boxForOrange1.add(oranges1,12);
        boxForOrange2.add(oranges2,15);
        boxForOrange1.countWeight();
        boxForOrange2.countWeight();
        System.out.println(boxForOrange1.formatForOranges(oranges1) + ": " +
                boxForOrange1.getWeightOfBox());
        System.out.println(boxForOrange2.formatForOranges(oranges2) + ": " +
                boxForOrange2.getWeightOfBox());

        System.out.println(boxForApple1.formatForApples(apples1) + " and " +
                boxForOrange1.formatForOranges(oranges1) + " are the same - " +
                boxForApple1.compare(boxForOrange1));
        System.out.println(boxForApple2.formatForApples(apples2) + " and " +
                boxForApple1.formatForApples(apples1) + " are the same - " +
                boxForApple2.compare(boxForApple1));
        System.out.println(boxForOrange2.formatForOranges(oranges2) + " and " +
                boxForApple1.formatForApples(apples1) + " are the same - " +
                boxForOrange2.compare(boxForApple1));


        boxForApple1.moveFriuts(boxForApple2);
        boxForOrange2.moveFriuts(boxForOrange1);
        boxForOrange1.countWeight();
        boxForOrange2.countWeight();
        boxForApple1.countWeight();
        boxForApple2.countWeight();


        System.out.println(boxForApple1.formatForApples(apples1) + ": " +
                boxForApple1.getWeightOfBox());
        System.out.println(boxForApple2.formatForApples(apples2) + ": " +
                boxForApple2.getWeightOfBox());
        System.out.println(boxForOrange1.formatForOranges(oranges1) + ": " +
                boxForOrange1.getWeightOfBox());
        System.out.println(boxForOrange2.formatForOranges(oranges2) + ": " +
                boxForOrange2.getWeightOfBox());

        System.out.println(boxForApple2.formatForApples(apples2) + " and " +
                boxForOrange1.formatForOranges(oranges1) + " ate the same - " +
                boxForApple2.compare(boxForOrange1));
    }
}
