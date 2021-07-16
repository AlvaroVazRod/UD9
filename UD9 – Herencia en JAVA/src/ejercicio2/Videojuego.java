package ejercicio2;

public class Videojuego {
	 //atributos
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;
    
    public Videojuego() {
        this.titulo = "";
        this.horasEstimadas = 10;
        this.entregado = false;
        this.genero = "";
        this.compañia = "";
    }

    
    //Constructor con valores heredados
    public Videojuego(String titulo, int horasEstimadas, boolean entregado, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = entregado;
        this.genero = genero;
        this.compañia = compañia;
    }

    //metodos de la interfaz
    public void entregar() {
        this.entregado = true;
    }
    
    public void devolver() {
        this.entregado = false;
    }
    
    public boolean isEntregado() {
        return this.entregado;
    }
    
    public void compareTo(Object a) {
        if (a instanceof Videojuego) {
            System.out.println("El juego 1 tiene " + this.horasEstimadas + " horas, el 2 tiene " + ((Videojuego)a).getHorasEstimadas());
        }
    }
    
    //toString
    public String toString() {
        return "titulo = " + titulo + ", horasEstimadas = " + horasEstimadas + ", entregado = " + entregado
                + ", genero = " + genero + ", compañia = " + compañia;
    }

    //gets y sets
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }
    public int compararHoras(int numeroHoras) {
    	if(this.horasEstimadas>numeroHoras) {
    		numeroHoras=this.horasEstimadas;
    	}
    	return numeroHoras;
    }
}
