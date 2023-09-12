package biblioteca;

public class Libro {
	
	private String nombre;
	private char genero;
	private int paginas;
	
	public Libro(String  nombre,int paginas, char genero) { 
		this.nombre=nombre;
		this.paginas=paginas;
		this.genero=genero;
	}
	
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public char getGenero() {
		return this.genero;
	}
	
	public int getPaginas() {
		return this.paginas;
	}
}
