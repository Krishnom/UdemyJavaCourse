package generics.example;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private static final int WINNING_POINTS = 2;
    private String name;
    private int played = 0;
    private int points = 0;
    private int won = 0;
    private int tied = 0;
    private int lost = 0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println("Player already present");
            return;
        }

        members.add(player);
        System.out.println("Player " + player.getName() + " added to " + name);
    }

    public int getTeamSize() {
        return members.size();
    }


    public void matchResults(Team<T> opponent, int ourScore, int opponentScore) {
        String message;
        played++;
        if (ourScore > opponentScore) {
            won++;
            points += WINNING_POINTS;
            message = " beat ";
        } else if (ourScore == opponentScore) {
            tied++;
            points++;
            message = " tied with ";
        } else {
            lost++;
            message = " lost to ";
        }

        if (opponent != null) {
            System.out.println(getName() + message + opponent.getName());
            opponent.matchResults(null, opponentScore, ourScore);
        }
    }

    public int getPoints() {
        return points;
    }

    public int getRanking() {
        return won * 2 + tied;
    }

    /**
     * compare based on ranking
     *
     * @param opponentTeam Team to compare with
     * @return -1 if teams ranking is greater than team opponentTeam, 1 of lower, 0 if same
     */
    @Override
    public int compareTo(Team<T> opponentTeam) {

        if (this.getRanking() > opponentTeam.getRanking()) {
            return -1;
        } else if (this.getRanking() < opponentTeam.getRanking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
