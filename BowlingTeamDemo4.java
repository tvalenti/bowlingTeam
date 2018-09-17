/*  Filename: BowlingTeamDemo4.java
    Author: Tom Date: 8/3/18 */
import javax.swing.JOptionPane;
public class BowlingTeamDemo4
{
    public static void main(String[] args) 
    {
        // Declare variables
        String name;
        String teamMbrsMsg = "Bowling Teams and Members\n";
        final int NUM_TEAM_MEMBERS = 4;
        final int NUM_TEAMS = 4;
        
        // Constructor
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        
        getTeamData(teams);
        

        // Loop to concatinate a message as a list of team members
        for (int y = 0; y < NUM_TEAMS; y++) 
        {
            teamMbrsMsg += "\nTeam:  " + teams[y].getTeamName() + "\n";

            for (int i = 0; i < NUM_TEAM_MEMBERS; i++) 
            {
                teamMbrsMsg += (i + 1) + ":  " + teams[y].getMember(i) + "\n";
            }
            
        }

        // Displays team name and all members in order
        JOptionPane.showMessageDialog(null, teamMbrsMsg);
        

        name = JOptionPane.showInputDialog(null, "Enter a team name to see its roster");
        teamMbrsMsg = "";
        for (int y = 0; y < teams.length; y++) 
        {
            if(name.equalsIgnoreCase(teams[y].getTeamName()))
                for (int x = 0; x < NUM_TEAM_MEMBERS; x++) 
                {
                    teamMbrsMsg +="Team:  " + (y + 1) + "\n" + (x + 1) + ":  " + teams[y].getMember(x) + "\n";
                }
        }
        JOptionPane.showMessageDialog(null, teamMbrsMsg); 
    }

    public static void getTeamData(BowlingTeam[] teams)
    {
        // Declare variables
        String name;
        String teamMbrsMsg = "Bowling Teams and Members\n";
        final int NUM_TEAM_MEMBERS = 4;
        final int NUM_TEAMS = 4;

        for (int y = 0; y < NUM_TEAMS; y++) {
            teams[y] = new BowlingTeam();
            // Get user input for team name
            name = JOptionPane.showInputDialog(null, "Enter team name:");
            // Sets team name on bowlTeam
            teams[y].setTeamName(name);
            // Loops for user input to assign all members of the team
            for (int x = 0; x < NUM_TEAM_MEMBERS; x++) {
                name = JOptionPane.showInputDialog(null, "Enter team member's name:");
                teams[y].setMember(x, name);
            }
        }
    }
}