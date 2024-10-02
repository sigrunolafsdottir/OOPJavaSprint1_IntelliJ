package ooj.sprint1.demos.enums;

//random comment
public class TeamPlayer {
    
    public enum Team {BLUE("blåa laget", 4),
            RED("röda laget", 5),
            YELLOW("gula laget", 7);

        public final String  teamName;
        public final int  luckyNumber;

        Team (String name, int luckyNumber)  {
           this.teamName = name;
           this.luckyNumber = luckyNumber;
        }
    }
    
    protected String name;
    protected Team team;
    
    public TeamPlayer(String name, Team team) {
        this.name = name;
        this.team = team;
    }
    
    public Team getTeam() {
        return team;
    }
    
    public String getName() {
        return name;
    }
}





//Kort definition, bara konstanterna
//    public enum Team {BLUE, RED, YELLOW};
