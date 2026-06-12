import br.com.taigoti.watchme.calculus.CalculeTime;
import br.com.taigoti.watchme.models.Movie;
import br.com.taigoti.watchme.models.Series;

public class Main {
    static void main(String[] args) {
        Movie matrix = new Movie();
        matrix.setName("The Matrix");
        matrix.setYear(1999);
        matrix.setRating(4.8);
        matrix.setGenre("Fiction");
        matrix.setDirector("Wachowski Sisters");
        matrix.setWriter("Wachowski Sisters");
        matrix.setDuration(137);

        Series houseMD = new Series();
        houseMD.setName("House MD");
        houseMD.setYear(1999);
        houseMD.setRating(4.9);
        houseMD.setGenre("Drama");
        houseMD.setDirector("David Shore");
        houseMD.setSeasons(8);
        houseMD.setEpisodesPerSeason(20);
        houseMD.setDuration(45);

        matrix.getInfos();
        System.out.println("\n*****************************\n");
        houseMD.getInfos();

        System.out.println("\n*****************************\n");
        CalculeTime calculator = new CalculeTime();
        calculator.addTitle(matrix);
        calculator.addTitle(houseMD);
        calculator.getTotalTime();
    }
}