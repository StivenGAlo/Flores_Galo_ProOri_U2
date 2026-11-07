/**
 * Class Netflix
 */
package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase Netflix que extiende de ContenidoAudiovisual
public class Netflix extends ContenidoAudiovisual {
    private String plan;
    private List<ContenidoAudiovisual> catalogo;

    public Netflix(String titulo, int duracionEnMinutos, String genero, String plan) {
        super(titulo, duracionEnMinutos, genero);
        this.plan = plan;
        this.catalogo = new ArrayList<>();
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public List<ContenidoAudiovisual> getCatalogo() {
        return catalogo;
    }

    public boolean agregarContenido(ContenidoAudiovisual contenido) {
        if (contenido == null || contenido == this || catalogo.contains(contenido)) {
            return false;
        }
        catalogo.add(contenido);
        return true;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de Netflix:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Plan: " + plan);
        System.out.println("Catálogo:");
        for (ContenidoAudiovisual c : catalogo) {
            System.out.println("  - " + c.getTitulo() + " (" + c.getClass().getSimpleName() + ")");
        }
        System.out.println();
    }
}