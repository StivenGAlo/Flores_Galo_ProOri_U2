/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private List<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = new ArrayList<>();
    }

    public Temporada agregarTemporada(int cantidadEpisodios, int anioEstreno) {
        Temporada t = new Temporada(temporadas.size() + 1, cantidadEpisodios, anioEstreno);
        temporadas.add(t);
        return t;
    }

    public List<Temporada> getTemporadas() {
        return new ArrayList<>(temporadas);
    }

    public int getNumeroTemporadas() {
        return temporadas.size();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Número de temporadas: " + temporadas.size());
        for (Temporada t : temporadas) {
            System.out.println("  - " + t);
        }
        System.out.println();
    }
}