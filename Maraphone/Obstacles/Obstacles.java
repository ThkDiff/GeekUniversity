package Maraphone.Obstacles;

public class Obstacles {
    private String name;
    private int run;
    private double jump;
    private int swim;

    public Obstacles(String name, int run, double jump, int swim) {
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public double getJump() {
        return jump;
    }

    public int getSwim() {
        return swim;
    }
}
