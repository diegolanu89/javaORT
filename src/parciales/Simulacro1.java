package parciales;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Simulacro1 {
	
	public final static char SI = 'S';
	public final static char NO='N';
	public final static char BLANCO='B';
	public static final char ESCAPE='F';
	
	public static int inputNumberEdad() {
		Scanner sc=new Scanner(System.in);  
		int num ;
		do {
			try{
		        System.out.printf("Ingrese edad :");
		        num = sc.nextInt();
		    } catch (InputMismatchException e){
		        System.out.printf("Debe Ingresar un número >18:");
		        sc.nextLine();
		        num = sc.nextInt();
		    }
		}while(num<18);
		return num;
	}
	
	public static char inputVoto() {
		Scanner sc=new Scanner(System.in);  
		char voto;
		do {
			try{
		        System.out.printf("Ingrese voto:");
		         voto  = sc.next().charAt(0);
		    } catch (InputMismatchException e){
		        System.out.printf("Debe Ingresar S|N|B|F: ");
		        sc.nextLine();
		        voto =  sc.next().charAt(0);
		    }
		}while(voto!=SI && voto!=NO && voto!=BLANCO && voto!='F');
		return voto;
	}
	
	public static void main(String[] args) throws Exception {
		
		char voto;
		int edad;
		double promEdad;
		int sumEdad=0, contSi=0, contNo=0, contBlanco=0,votantes=0,max=0;
		int contadores[]=new int[3];
		
		
		edad = inputNumberEdad();
		voto = inputVoto();
		while (voto!=ESCAPE) {
			switch(voto) {
			case SI:
				contSi++;
				if(contSi>max)max=contSi;
				break;
			case NO: 
				contNo++;
				if(contNo>max)max=contNo;
				break;
			case BLANCO:
				contBlanco++;
				if(contBlanco>max)max=contBlanco;
				break;
			}
			sumEdad+=edad;
			votantes++;
			edad = inputNumberEdad();
			voto = inputVoto();
		}
		
		if(votantes>1) {//si hay votantes para compara los contadores
			System.out.printf("Ganador:%d \n",max); 
			System.out.printf("Porcentaje puntaje: %s\t %d pts\n",(double)contNo*100/(double)votantes); 
			System.out.printf("Promedio de edad de votantes:%d \n",sumEdad/votantes); 
		}
			
		System.out.println("\nPress Any Key To Continue...");
	    new java.util.Scanner(System.in).nextLine();
				
	}
}

