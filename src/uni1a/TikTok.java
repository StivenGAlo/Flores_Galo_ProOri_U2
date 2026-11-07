/**
 * Class TikTok
 */
package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase TikTok que extiende de ContenidoAudiovisual
public class TikTok extends ContenidoAudiovisual {
    private String creador;
    private int likes;
    private List<Actor> participantes;

    public TikTok(String titulo, int duracionEnMinutos, String genero, String creador) {
        super(titulo, duracionEnMinutos, genero);
        this.creador = creador;
        this.likes = 0;
        this.participantes = new ArrayList<>();
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getLikes() {
        return likes;
    }

    public void darLike() {
        likes++;
    }

    public List<Actor> getParticipantes() {
        return participantes;
    }

    public void agregarParticipante(Actor actor) {
        if (actor != null && !participantes.contains(actor)) {
            participantes.add(actor);
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del TikTok:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Creador: " + creador);
        System.out.println("Likes: " + likes);
        System.out.println("Participantes: " + participantes);
        System.out.println();
    }
}