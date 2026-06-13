import br.com.taigoti.models.Album;
import br.com.taigoti.models.Artist;
import br.com.taigoti.models.Music;

public class Main {
    static void main(String[] args) {
        Artist anavitoria = new Artist("Anavitória");
        Album esquinas = new Album("Esquinas", anavitoria);

        Music sapato = new Music("Se eu usasse sapato", anavitoria, esquinas, 166);
        Music minto = new Music("Minto pra quem perguntar", anavitoria, esquinas, 188);

        esquinas.setAudios(sapato);
        esquinas.setAudios(minto);
        System.out.println(esquinas.getAudios());
    }
}