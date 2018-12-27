package Marathon2.TeamAndMembers;

import Marathon2.Interface.Competitor;

public class Team {
    private String name;

    public Team(String name) {
        this.name = name;
    }

    private Competitor[] competitors = {new Human("Боб"),
            new Cat("Барсик"), new Dog("Бобик")};

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void getInfo() {
        for (Competitor c : competitors) {
            c.info();
        }
    }
}
