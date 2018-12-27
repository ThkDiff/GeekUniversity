package Maraphone.TeamAndMembers;

public class TeamMember {
    private String name;
    private String gender;
    private int run_limit;
    private double jump_limit;
    private int swim_limit;
    private int counter = 0;

    public TeamMember(String name, String gender, int run_limit, double jump_limit, int swim_limit) {
        this.name = name;
        this.gender = gender;
        this.run_limit = run_limit;
        this.jump_limit = jump_limit;
        this.swim_limit = swim_limit;
    }

    public void enhanceCounter(){
        counter++;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getRun_limit() {
        return run_limit;
    }

    public double getJump_limit() {
        return jump_limit;
    }

    public int getSwim_limit() {
        return swim_limit;
    }

    public int getCounter() {
        return counter;
    }
}
