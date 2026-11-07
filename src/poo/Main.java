package poo;
import uni1a.*;
public class Main {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Leonardo DiCaprio", 50, "Estadounidense");
        Actor actor2 = new Actor("Marion Cotillard", 49, "Francesa");
        Investigador investigador = new Investigador("Jane Goodall", "Primatologia", "Jane Goodall Institute");
 
        Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia ficcion", "Warner Bros");
        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor2);
 
        SerieDeTV serie = new SerieDeTV("Dark", 50, "Suspenso");
        serie.agregarTemporada(10, 2017);
        serie.agregarTemporada(8, 2019);
 
        Documental documental = new Documental("Planeta Tierra", 90, "Naturaleza", "Biodiversidad");
        documental.agregarInvestigador(investigador);
 
        Netflix netflix = new Netflix("Seleccion Netflix", 30, "Variado", "Premium");
        netflix.agregarContenido(pelicula);
        netflix.agregarContenido(serie);
        netflix.agregarContenido(documental);
 
        TikTok tiktok = new TikTok("Baile", 1, "Entretenimiento", "@usuario");
        tiktok.agregarParticipante(actor1);
        tiktok.darLike();
        tiktok.darLike();
 
        ContenidoAudiovisual[] contenidos = {pelicula, serie, documental, netflix, tiktok};
        for (ContenidoAudiovisual c : contenidos) {
            c.mostrarDetalles();
        }
    }
}
 