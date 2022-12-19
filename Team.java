package corelesson1;

public class Team extends Animal {
    private String teamName;
    Participant[] participants = new Participant[4];

    public Team(String teamName, Participant[] participants) {
        this.teamName = teamName;
        this.participants = participants;
    }

    public String getTeamName(){
        return "Team name: "+teamName;
    }

    public Participant[] getParticipants(){
        return participants;
    }

    public void showResults(){
        for(Participant c: participants){
            c.showResult();
        }
    }

    public void showParticipantsFinishedCourse(){
        for(Participant c: participants){
            if(c.isOnDistance())
                c.showResult();
        }
    }
}