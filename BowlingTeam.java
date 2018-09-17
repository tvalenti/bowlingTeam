/*  Filename: BowlingTeam.java
    Author: Tom Date: 8/3/18 */

public class BowlingTeam
{
    //  Declare variables
    private String teamName;
    private String[] members = new String[4];

    // Mutator methods
    public void setTeamName(String team)
    {
        teamName = team;
    }
    
    public void setMember(int number, String name)
    {
        members[number] = name;
    }

    // Acessor methods
    public String getTeamName()
    {
        return teamName;
    }

    public String getMember(int number)
    {
        return members[number];
    }
}