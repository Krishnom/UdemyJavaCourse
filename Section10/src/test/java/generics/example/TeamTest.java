package generics.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeamTest {

    private static final short WINNING_POINTS = 2;

    @Test
    void cricketPlayerIsAbleToJoinCricketTeam() {
        Team<CricketPlayer> cricketPlayerTeam = new Team("Cricket Team");
        cricketPlayerTeam.addPlayer(new CricketPlayer("A Cricket Player"));
    }

    @Test
    void teamWithHighestRankingWins() {
        Team<CricketPlayer> cricketPlayerTeamA = new Team("Cricket Team A");
        Team<CricketPlayer> cricketPlayerTeamB = new Team("Cricket Team B");
        cricketPlayerTeamA.matchResults(cricketPlayerTeamB, 340, 330); //A wins
        cricketPlayerTeamA.matchResults(cricketPlayerTeamB, 330, 330); //Draw
        //A will win with 2 points
        assertEquals(-1, cricketPlayerTeamA.compareTo(cricketPlayerTeamB));
    }

    @Test
    void everyWinGivesPointsToWinningTeam() {
        Team<CricketPlayer> cricketPlayerTeamA = new Team("Cricket Team A");
        Team<CricketPlayer> cricketPlayerTeamB = new Team("Cricket Team B");
        cricketPlayerTeamA.matchResults(cricketPlayerTeamB, 340, 330); //A wins
        //A will win with WINNING_PONTS points
        assertEquals(WINNING_POINTS, cricketPlayerTeamA.getPoints());
    }

}