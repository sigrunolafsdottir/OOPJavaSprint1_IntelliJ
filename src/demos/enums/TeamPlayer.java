package ooj.sprint1.demos.enums;

public class TeamPlayer {
    
    public enum Team {BLUE("blåa laget"), 
            RED("röda laget"), 
            YELLOW("gula laget");
        public final String  teamName;
        Team (String name)  {
            teamName = name;
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


/*//varje konstant associerad till ett värdet




//Kort definition, bara konstanterna
    public enum Team {BLUE, RED, YELLOW};
    */