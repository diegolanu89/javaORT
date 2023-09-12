package misClases;

import java.util.Scanner;

public class PiedraPapelTijera {

    final static String PIEDRA = "Piedra";
    final static String PAPEL = "Papel";
    final static String TIJERA = "Tijera";
    final static String BARTOLO = "BARTOLO";
    final static String ANA = "ANA";
    final static String EMPATE = "EMPATE";

	
	public PiedraPapelTijera() {
		int ptsAna= 0;
        int ptsBartolo = 0;
        int ptjeGanador = 0;
        String ganador = "";
        String opcionAna = "";
        String opcionBartolo= "";
        String resultado="";

        ptjeGanador = inputInt("Ingrese el puntaje a ganar:");
     
             while(ptsAna<ptjeGanador && ptsBartolo<ptjeGanador){
                 opcionAna = inputOpcion("Elección de Ana:");
                 opcionBartolo = inputOpcion("Elección de Bartolo:");
                 resultado = ganador(opcionAna,opcionBartolo);
                 switch(resultado){
                     case ANA:ptsAna++;
                     break;
                     case BARTOLO:ptsBartolo++;
                     break;
                 }
                 if(resultado.equals(EMPATE))
                	 System.out.printf("Se empata esta Ronda\n");
                 else    
                	 System.out.printf("Ganador de la Ronda: %s\n",resultado);
             }
         
         if(ptsAna>ptsBartolo){
             System.out.printf("Ganador: %s\n",ANA);
         }else{
             System.out.printf("Ganador: %s\n",BARTOLO);
         }
	}
	
	 public int inputInt(String msg){
	        Scanner sc = new Scanner(System.in);
	        System.out.print(msg);
	        int num = sc.nextInt();
	        return num;
	    }

	
	public String inputString(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        String str = scanner.nextLine();
        str = scanner.nextLine();
        return str;
    }

    public String inputOpcion(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        String str = scanner.nextLine();
        while(str.equals(PIEDRA) && str.equals(PAPEL) && str.equals(TIJERA)){
            System.out.print("Ingrese nuevamente, solo puede ser Piedra/Papel/Tijera:");
            str = scanner.nextLine();
        }
        return str;
    }

    public String ganador(String opcionAna,String opcionBartolo){
        if(opcionAna.equals(opcionBartolo))return EMPATE;
        switch(opcionAna){
            case(PIEDRA):
                    if(opcionBartolo.equals(TIJERA))return ANA;
                break;
            case(PAPEL):
                    if(opcionBartolo.equals(PIEDRA))return ANA;
                break;
            case(TIJERA):
                    if(opcionBartolo.equals(PAPEL))return ANA;
                break;
        }
        return BARTOLO;
    }
}
