package corelesson1;

public class Course{
    Pool[] pools;

    public Course(Pool[] pools){
        this.pools = pools;
    }

    public void doIt(Team team){
        Participant[] participants = team.getParticipants();
        if(participants.length > 0){
            for (Participant c: participants){
                for (Pool o: pools){
                    o.doIt(c);
                    if (!c.isOnDistance()) break;
                }
            }
        } else {
            System.out.println("Нет ни одного участника!");
        }
    }
}
