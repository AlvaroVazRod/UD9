package ejercicio2;


public class Ejercicio2App {

    public static void main(String[] args) {
    	int numeroHoras=0,numeroHorasIncial=0,instancia=0,numeroTemporadas=0,numeroTemporadasInicial=0,sumatorio=0;

        //Iniciamos las posiciones
        Serie [] listaS = new Serie [5];
        listaS [0] = new Serie("Elite", 12, false, "Suspense", "Francisco Ramos");
        listaS [1] = new Serie("Doraemon", 4, false, "Manga", "Fujiko F. Fujio");
        listaS [2] = new Serie("Como defender a un asesino", 6, false, "Crimen", "Shonda Rhimes");
        listaS [3] = new Serie("Game of thrones", 8, false, "Drama", "George R. R. Martin");
        listaS [4] = new Serie("Las chicas gilmore", 7, false, "Comedia", "Amy Sherman-Palladino");

        Videojuego [] listaV = new Videojuego [5];
        listaV [0] = new Videojuego("Assassins Creed", 300, false, "    Acción-aventura", "Ubisoft");
        listaV [1] = new Videojuego("Los sims", 100, false, "Simulación", "EA");
        listaV [2] = new Videojuego("Fallout Shelter", 200, false, "Simulación", " Bethesda Game Studios");
        listaV [3] = new Videojuego("GTA V", 40, false, "    Acción-aventura", "Rockstar Games");
        listaV [4] = new Videojuego("Monopoly", 6, false, "Juego de mesa", "Hasbro");

        //Entregamos 1 serie i 1 videojuego
        listaS[3].entregar();
        listaV[4].entregar();



        //Comparaciones llamando a compareTo
        listaS[1].compareTo(listaS[2]);
        listaV[2].compareTo(listaV[3]);
        for (int i = 0; i < listaV.length; i++) {
        	numeroHoras=listaV[i].compararHoras(numeroHoras);
        	if(numeroHoras>numeroHorasIncial) {
        		instancia=i;
        	}
        	numeroHorasIncial=listaV[i].compararHoras(numeroHorasIncial);
		}
        instancia=0;
        System.out.println(listaV[instancia].toString());
        for (int i = 0; i < listaS.length; i++) {
        	numeroTemporadas=listaS[i].comparaTemporadas(numeroTemporadas);
        	if(numeroTemporadas>numeroTemporadasInicial) {
        		instancia=i;
        	}
        	numeroTemporadasInicial=listaS[i].comparaTemporadas(numeroTemporadasInicial);
		}
        System.out.println(listaS[instancia].toString());
        for (int i = 0; i < listaV.length; i++) {
			if(listaV[i].isEntregado()==true) {
				System.out.println(listaV[i].toString());
				sumatorio++;
			}
			if (listaS[i].isEntregado()==true) {
				System.out.println(listaS[i].toString());
				sumatorio++;
			}
		}
        System.out.println("El numero de pelis y series entregados son "+sumatorio);
    }

}