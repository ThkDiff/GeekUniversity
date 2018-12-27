package Maraphone.TeamAndMembers;

import java.util.Random;

public class Team {

    Random random = new Random();

    private String name;

    public Team(String name) {
        this.name = name;
    }

    private TeamMember[] teamMembers = { new TeamMember("Vova","male",random.nextInt(10),
            random.nextInt(7),random.nextInt(10)),
            new TeamMember("Rebecca","female",random.nextInt(10),
                    random.nextInt(7),random.nextInt(10)),
            new TeamMember("Alex","male",random.nextInt(10),
                    random.nextInt(7),random.nextInt(10)),
            new TeamMember("Sintia","female",random.nextInt(10),
                    random.nextInt(7),random.nextInt(10)),
            new TeamMember("Tatiana","female",random.nextInt(10),
                    random.nextInt(7),random.nextInt(10))
    };

    public void getInformation(){
        int general = 0;
        for (TeamMember t : teamMembers) {
            System.out.println(t.getName() + " : " + t.getCounter());
            general += t.getCounter();
        }
        System.out.println("Total score of team: " + general);
    }

    public TeamMember[] getTeamMembers() {
        return teamMembers;
    }
}
