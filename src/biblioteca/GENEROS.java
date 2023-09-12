package biblioteca;

public enum GENEROS {
	INFANTIL('I'),
	NOVELA('N'),
	HISTORIA('H');

	private final char genero;
	 
    private GENEROS(char i) {
        this.genero = i;
    }
 
    public char getGenero() {
        return genero;
    }
}
