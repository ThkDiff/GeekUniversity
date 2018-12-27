package Marathon2.ObstaclesAndCourse;

import Marathon2.Interface.Competitor;
import Marathon2.TeamAndMembers.Team;

public class Course {
    private Obstacle[] course = {new Cross(80), new Wall(2),
            new Wall(1), new Cross(120)};

    public void goTeam(Team team) {
        for (Competitor c : team.getCompetitors()) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }

    public Obstacle[] getCourse() {
        return course;
    }
}
