package generics.example;

public class TeamMain {

    public static void main(String[] args) {

        //Let's play india and pakistan cricket match

        playCricketMatch();
//        playFootBallMatch();
    }

    private static void playFootBallMatch() {
        //Indian team
        FootballPlayer bhaichung = new FootballPlayer("Baichung Bhutia");
        FootballPlayer chhetri = new FootballPlayer("Sunil Chhetri");

        //Pakistani team
        FootballPlayer iqbal = new FootballPlayer("Amjad Iqbal");
        FootballPlayer essa = new FootballPlayer("Muhammad Essa");

        Team<FootballPlayer> indianTeam = new Team<>("Indian Soccer Team");
        Team<FootballPlayer> pakistanTeam = new Team<>("Pakistani Soccer Team");

        //3 match series
        pakistanTeam.matchResults(indianTeam, 2, 10);
        pakistanTeam.matchResults(indianTeam, 5, 3);
        pakistanTeam.matchResults(indianTeam, 3, 1);
        System.out.println("Pakistan : " + pakistanTeam.getRanking() + " India : " + indianTeam.getRanking());

        announceWinner(indianTeam, pakistanTeam);
    }

    private static void playCricketMatch() {
        String[] indianCricketTeamPlayer = {"Sachin Tendulkar", "Sehwag", "Ganguly", "Dhoni"};
        String[] pakistaniCricketTeamPlayer = {"Injemam Ul Haq", "Yunis Khan", "Yusif Youhana", "Shoeb Akhtar"};
        Team<CricketPlayer> indianCricketTeam = new Team<>("Indian Cricket Team");
        Team<CricketPlayer> pakistanCricketTeam = new Team<>("Pakistan Cricket Team");

        for (String player : indianCricketTeamPlayer) {
            indianCricketTeam.addPlayer(new CricketPlayer(player));
        }

        for (String player : pakistaniCricketTeamPlayer) {
            pakistanCricketTeam.addPlayer(new CricketPlayer(player));
        }

        //3 match ODI series
        pakistanCricketTeam.matchResults(indianCricketTeam, 150, 346);
        pakistanCricketTeam.matchResults(indianCricketTeam, 298, 190);
        pakistanCricketTeam.matchResults(indianCricketTeam, 312, 400);

        //print rankings
        System.out.println("Pakistan : " + pakistanCricketTeam.getRanking() + " India : " + indianCricketTeam.getRanking());
        announceWinner(indianCricketTeam, pakistanCricketTeam);
    }

    private static void announceWinner(Team team1, Team team2) {
        int results = team1.compareTo(team2);
        if (results == 1) {
            System.out.println(team2.getName() + " Wins the series");
        } else if (results == -1) {
            System.out.println(team1.getName() + " Wins the series");
        } else {
            System.out.println("Series drawn between " + team1.getName() +
                    " and " + team2.getName());
        }
    }
}
