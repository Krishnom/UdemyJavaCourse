package generics.challenge;

import generics.example.Team;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String title;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String title) {
        this.title = title;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println("Team " + team.getName() + " already added to league " + getTitle());
            return false;
        }
        teams.add(team);
        System.out.println("Team " + team.getName() + " Added to league " + getTitle());
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(teams);
        System.out.println("===================================================");
        System.out.println("League scoreboard");
        for (T team : teams) {
            System.out.println(team.getName() + " : " + team.getRanking());
        }
        System.out.println("===================================================");
    }

    public String getTitle() {
        return title;
    }

    public T getTeam(int i) {
        return teams.get(i);
    }
}
