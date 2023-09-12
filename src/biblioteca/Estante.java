package biblioteca;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Estante {
	
	private static final char INFANTIL = 'I';
	private static final char HISTORIA = 'H';
	private static final char NOVELA = 'N';
	
	Map<String, Libro> libros = new HashMap<String, Libro>();
	Input input=new Input();
	int cantLibros = 0;
	int cantInfantil = 0;
	int cantNovela = 0;
	int cantHistoria = 0;

	public void ingresarLibros() {
			String nombre;
			char genero;
			int paginas;
			nombre = input.inputString("Ingrese nombre del libro:");
			while(!nombre.equals("FIN")) {
				genero = input.inputChar("Ingrese genero:","Dato debe ser C,H o I","NHI");
				procesarGenero(genero);
				paginas = input.inputInt("Ingrese el número de páginas:","No puede poseer paginas negativas o nulas",1);
				libros.put(nombre, new Libro(nombre,paginas,genero));
				cantLibros = cantLibros+1;
				nombre = input.inputString("Ingrese nombre del libro:");
			}
	}
	
	private void iterar() {
		for (Entry<String, Libro> entry : libros.entrySet()) {
               System.out.printf("%s\t %d \t%s\n",
            		   entry.getValue().getNombre(),
            		   entry.getValue().getNombre(),
            		   entry.getValue().getGenero()); 
        }
	}
	
	private void procesarGenero(char genero) {
		switch(genero){
			case INFANTIL:
				cantInfantil =  cantInfantil + 1;
			break;
			
			case NOVELA:
				cantNovela =  cantNovela + 1; 
			break;
			
			case HISTORIA:
				cantHistoria =  cantHistoria + 1; 
			break;
		}
	}
	
	public int getCantInfantil() {
		return cantInfantil;
	}
	
	public int getCantNovela() {
		return cantNovela;
	}
	
	public int getCantHistoria() {
		return cantHistoria;
	}

	public int getCantidadLibros() {
		return cantLibros;
	}

}
