package uni1a;

 
public class Temporada {
    private int numero;
    private int cantidadEpisodios;
    private int añoEstreno;


    public Temporada(int numero, int cantidadEpisodios, int anioEstreno) {
        this.numero = numero;
        this.cantidadEpisodios = cantidadEpisodios;
        this.añoEstreno = anioEstreno;
    }

    public int getNumero() {
        return numero;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public int getAnioEstreno() {
        return añoEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.añoEstreno = anioEstreno;
    }

    @Override
    public String toString() {
        return "Temporada " + numero + " - " + cantidadEpisodios
                + " episodios (" + añoEstreno + ")";
    }
}