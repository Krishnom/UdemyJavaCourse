package examples.polymorphism;

public class Main {
    public static void main(String[] args) {
        Movie movie = getRandomMovie();
        System.out.println("Playing : " + movie.getName());
        movie.plot();
    }

    private static Movie getRandomMovie() {
        int randomMovieNum = (int) ((Math.random() * 5) + 1);
        System.out.println(randomMovieNum);
        switch (randomMovieNum) {
            case 1:
                return new DDLJ();
            case 2:
                return new RajaHindustani();
            case 3:
                return new Sholey();
            case 4:
                return new Baazigar();
            case 5:
                return new Movie();
        }
        return null;
    }
}
