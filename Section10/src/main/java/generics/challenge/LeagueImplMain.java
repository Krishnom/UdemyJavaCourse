package generics.challenge;

import generics.example.CricketPlayer;
import generics.example.Team;

import java.time.LocalDate;

public class LeagueImplMain {
    public static void main(String[] args) {
        String[] participatingTeams = {"India", "Pakistan", "Australia", "New Zealand", "England"};
        League<Team<CricketPlayer>> worldCupLeague = new League<>("ODI Worldcup");
        for (String teamName : participatingTeams) {
            //Create team
            Team<CricketPlayer> cricketTeam = new Team<>(teamName);
            //Create player
            cricketTeam.addPlayer(new CricketPlayer(teamName + " Player1"));
            //Add team to league
            worldCupLeague.addTeam(cricketTeam);
        }

        //lets play 15 games randomly
        int match = 1;
        int noOfTeams = participatingTeams.length;

        while (match <= 15) {
            //(Math.random() * ((max - min) + 1)) + min
            int team1Code = (int) (Math.random() * noOfTeams);
            int team2Code = (int) (Math.random() * noOfTeams);

            if (team1Code == team2Code) {
                continue;
            }

            System.out.println("Match #" + match);
            Team team1 = worldCupLeague.getTeam(team1Code);
            Team team2 = worldCupLeague.getTeam(team2Code);

            int team1Score = (int) (Math.random() * 400);
            int team2Score = (int) (Math.random() * 400);

            team1.matchResults(team2, team1Score, team2Score);
            match++;
            worldCupLeague.showLeagueTable();
        }
        System.out.println("And the winner of the worldcup " + LocalDate.now().getYear() +
                " is " + worldCupLeague.getTeam(0).getName());
    }
}
