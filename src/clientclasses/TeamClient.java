package clientclasses;

import textbookquestions.Team;

/**
 * This is the client class for Team
 *
 * @author Ali Zoubeidi
 */
public class TeamClient {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Team team = new Team();
        team.getTeamName();
        team.setTeamName("FC Barcelona");
        System.out.println(team);

        Team team2 = new Team("FC Barcelona");
        team2.getTeamName();
        System.out.println(team2);
        
        if (team.equals(team2)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
        
        System.out.println(team.toString()); // explicit call

    }
}
