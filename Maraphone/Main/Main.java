package Maraphone.Main;

import Maraphone.Obstacles.Course;
import Maraphone.TeamAndMembers.Team;

public class Main {
    public static void main(String[] args){
        Team team = new Team("Victoria");
        Course course = new Course();
        course.goTeam(team);
        team.getInformation();
    }
}
