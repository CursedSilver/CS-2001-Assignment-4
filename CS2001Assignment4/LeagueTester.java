import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
/**
 * Methods for testing the creation of a league, division, and teams.
 *
 * @author JohnRoss Gillespie &
 * @version 1
 */
public class LeagueTester
{
    // instance variables - replace the example below with your own
    private String leagueName;
    private ArrayList<String> coachNames = new ArrayList<>();
    private ArrayList<String> playerNames = new ArrayList<>();
    private ArrayList<String> teamNames = new ArrayList<>();
    private ArrayList<String> divisionNames = new ArrayList<>();
    private ArrayList<String> leagueNames = new ArrayList<>();
    private ArrayList<String> genders = new ArrayList<>();
    private ArrayList<String> numbers = new ArrayList<>();
    Random random;
    
    /**
     * Constructor for objects of class LeagueTester
     */
    public LeagueTester()
    {
        numbers.add("1"); numbers.add("2"); numbers.add("3"); numbers.add("4"); numbers.add("5"); numbers.add("6"); numbers.add("7"); 
        numbers.add("8"); numbers.add("9"); numbers.add("10"); numbers.add("11"); numbers.add("12"); numbers.add("13"); numbers.add("14");
        numbers.add("15");
        
        coachNames.add("Mr. Meesiks"); coachNames.add("Bird Person"); coachNames.add("Jerry");
        coachNames.add("Ralph"); coachNames.add("Micheal"); coachNames.add("Eric"); 
        coachNames.add("Brendan"); coachNames.add("Devin"); coachNames.add("Karl");
        
        genders.add("Male"); genders.add("Female");
        
        playerNames.add("John"); playerNames.add("Paul"); playerNames.add("Dawn");
        playerNames.add("Shawn"); playerNames.add("Jake"); playerNames.add("Chris");
        playerNames.add("David"); playerNames.add("Ben"); playerNames.add("Ross");
        playerNames.add("Greg"); playerNames.add("Klean"); playerNames.add("Tim");
        
        teamNames.add("Ninja's"); teamNames.add("Subs"); teamNames.add("Tat Army");
        teamNames.add("Morty's Smashers"); teamNames.add("Rick's Boys"); teamNames.add("Stark Army");
        teamNames.add("The Infamous"); teamNames.add("The Swift"); teamNames.add("The Dapper Marines");
        teamNames.add("The Grand Moons"); teamNames.add("The Fearless"); teamNames.add("The Sparks");
        
        divisionNames.add("Martell"); divisionNames.add("Baratheon"); divisionNames.add("Tyrell");
        divisionNames.add("GreyJoy"); divisionNames.add("Lannister"); divisionNames.add("Targaryen");
        
        leagueNames.add("Champion's League"); leagueNames.add("MLS"); leagueNames.add("FIFA"); 
        leagueNames.add("USSF"); leagueNames.add("We Can't Agree"); leagueNames.add("Team Redundant Team");
        
        
    }
    
    /**
     * Creates a random player
     */
    private Player randomPlayer()
    {
        Iterator iterator = numbers.listIterator();
        String randomPlayer = playerNames.get(random.nextInt(playerNames.size()));
        String randomNumber = numbers.get(random.nextInt(numbers.size()));
        return new Player(randomPlayer, randomNumber);
    }
    
    /**
     * Creates a random team
     */
    private Team randomTeam(int numPlayers)
    {
        String coachName = coachNames.get(random.nextInt(coachNames.size()));
        String gender = genders.get(random.nextInt(genders.size()));
        String teamName = teamNames.get(random.nextInt(teamNames.size()));
        ArrayList<Player> playerList = new ArrayList<>();
        for(int i = 0; i < numPlayers; i++) {
            Player player = randomPlayer();
            playerList.add(player);
        }
        return new Team(teamName, playerList, coachName, gender);
    }
    
    /** 
     * Creates a random Division
     */
    private Division randomDivision(int numTeams, int numPlayers)
    {
        String divisionName = divisionNames.get(random.nextInt(divisionNames.size()));
        ArrayList<Team> teamList = new ArrayList<>();
        for(int i=0; i < numTeams; i++) {
            Team team = randomTeam(numPlayers);
            teamList.add(team);
        }
        return new Division(divisionName, teamList);
    }
    
    /**
     * Creates a random league
     */
    private League createLeague(int numDivisions, int numTeams, int numPlayers)
    {
        String leagueName = leagueNames.get(random.nextInt(leagueNames.size()));
        ArrayList<Division> divisionList = new ArrayList<>();
        for(int i=0; i < numDivisions; i++) {
            Division division = randomDivision(numTeams, numPlayers);
            divisionList.add(division);
        }
        return new League(leagueName, divisionList);
    }
    
    /**
     * Sets up a random league with 4 divisons, 6 teams per division and 22 players per team.
     */
    public League leagueSetup()
    {
        this.random = new Random();
        return createLeague(4, 6, 22);
    }
    
    /**
     * Sets up a custom league 
     * 
     * @param numDivisions Number of divisions
     * @param numTeams Number of teams per division
     * @param numPlayers Number of players per team
     */
    public League customLeague(int numDivisions, int numTeams, int numPlayers)
    {
        this.random = new Random();
        return createLeague(numDivisions, numTeams, numPlayers);
    }
}
