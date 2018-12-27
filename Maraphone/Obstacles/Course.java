package Maraphone.Obstacles;

import Maraphone.TeamAndMembers.Team;
import Maraphone.TeamAndMembers.TeamMember;

public class Course {

    private Obstacles[] obstacles = { new Obstacles("run",8,0,0),
            new Obstacles("jump",0,5,0),
            new Obstacles("swim",0,0,7)
    };

    public void goTeam(Team team){
        for (TeamMember t : team.getTeamMembers())
            for (Obstacles o : obstacles)
                if (t.getRun_limit() >= o.getRun() && t.getJump_limit() >= o.getJump() && t.getSwim_limit() >= o.getSwim())
                    t.enhanceCounter();
    }
}
