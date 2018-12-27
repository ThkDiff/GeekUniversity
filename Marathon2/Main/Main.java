package Marathon2.Main;


import Marathon2.Interface.Competitor;
import Marathon2.ObstaclesAndCourse.Course;
import Marathon2.ObstaclesAndCourse.Cross;
import Marathon2.ObstaclesAndCourse.Obstacle;
import Marathon2.ObstaclesAndCourse.Wall;
import Marathon2.TeamAndMembers.Cat;
import Marathon2.TeamAndMembers.Dog;
import Marathon2.TeamAndMembers.Human;
import Marathon2.TeamAndMembers.Team;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Victoria");
        Course course = new Course();
        course.goTeam(team);
        team.getInfo();
    }
}
