package tech.println.tdd.imposter;


public class Main {


    public static void main(String[] args) {
        Actor bruce = new BruceWillis(200000);
        Actor understudy = new Understudy(2000);
        Movie movie = new DieHardMovie();
        movie.addActors(bruce);
        movie.addActors(understudy);
        System.out.println("Shooting \"Die Hard\"");
        movie.filming(false);
        movie.filming(true);
        movie.filming(false);
        movie.filming(true);
        System.out.println("Filmed");
    }
}
