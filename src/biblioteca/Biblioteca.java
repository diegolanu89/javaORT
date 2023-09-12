package biblioteca;

public class Biblioteca {
	Estante estantes[] =  new Estante[5];
	
	public Biblioteca() {
		
		int contInfantil = 0;
		int contNovela = 0;
		int contHistoria = 0;
		
		for(int i=0;i<5;i++) {
			estantes[i] = new Estante();
			estantes[i].ingresarLibros();
			contInfantil+=estantes[i].getCantInfantil();
			contNovela+=estantes[i].getCantNovela();
			contHistoria+=estantes[i].getCantHistoria();
			
		}
		
		System.out.println("\n***BIBLIOTECA***\n");
		System.out.printf("\nGénero\tCantidad\n");
		System.out.printf("\n%s\t%d\n",GENEROS.INFANTIL,contInfantil);
		System.out.printf("\n%s\t\t%d\n",GENEROS.NOVELA,contNovela);
		System.out.printf("\n%s\t%d\n",GENEROS.HISTORIA,contHistoria);
		System.out.printf("\nPROMEDIO DE LIBROS POR ESTANTE:");
		System.out.printf("%d\t%1.2f\n",promedio());
		
	}
	
	public double promedio() {
		double promedio;
		int suma = 0;
		for(int i=0;i<5;i++) {
			suma+=estantes[i].getCantidadLibros();
		}
		return (double)suma/5;
	}
	
	
}
