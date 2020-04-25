package textbookquestions;

/**
 * This is a Class encapsulating the concept of a team (for example, "FCB"),
 * assuming a team has only team name as an attribute. Include a constructor,
 * the accessor and mutator, and methods toString and equals. Write a client
 * class to test all methods.
 *
 * @author Ali Zoubeidi
 */
public class Team {

    private String teamName;

    public Team() {
        teamName = "unknown";
    }

    public Team(String startTeamName) {
        teamName = startTeamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public Team setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }

    public String toString() {
        return "Team Name: " + teamName;
    }

    public boolean equal(Object o) {
        if (!(o instanceof Team)) {
            return false;
        } else {
            Team objTeam = (Team) o;
            if (teamName.equals(objTeam.teamName)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
