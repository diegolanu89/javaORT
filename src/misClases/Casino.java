package misClases;

import java.util.Scanner;

public class Casino {
	
	final static double MIN_MONEY = 500.0;
    final static double MAX_ACUMULABLE = 5000.0;

    final static double RULETA = 100.0;
    final static double BLACKJACK = 200.0;
    final static double POCKER = 500.0;

    final static String RUL = "RUL";
    final static String BJK = "BJK";
    final static String PKR = "PKR";
	
	public Casino() {
		
		  double montoInicial = 0;
          double montoActual = 0;
          double acumulado = 0;
          String nombre = "";
          String juego="";
          int resultado = 0;
          double montoJuego= 0;
          int cant = 0,contRul=0,contPKR=0,contBJK=0;

          nombre = inputString("Ingrese su nombre:");
          montoInicial = inputDouble("Ingrese monto de dinero a jugar:");
          montoActual = montoInicial;

       if(montoInicial>=MIN_MONEY){
               while(montoSuficiente(montoInicial,montoActual) && acumulado<MAX_ACUMULABLE ){
                   montoJuego = inputJuego("¿Que juego Desea Jugar?:");
                   if(montoJuego<=montoActual){
                          System.out.printf("Monto del juego:$%1.2f\n",montoJuego);
                          montoActual-=montoJuego;
                          resultado=jugar();
                          montoActual=montoActual + ((double)resultado*montoJuego);
                          acumulado= resultado*montoJuego;
                          cant++;
                          switch(juego){
                          	case RUL:contRul++;
                          	break;
                          	case BJK:contBJK++;
                          	break;
                          	case PKR:contPKR++;
                          	break;
                          }
                   }else{
                       System.out.println("No le alcanza el dinero para este juego");
                   }
               }
               System.out.printf("Dinero restante:%1.2f\n",montoActual);
               System.out.printf("Porcentaje jugado:%1.2f \tTipo RULETA \tjugados:%d\n",(double)(contRul*100)/cant,contRul);
               System.out.printf("Porcentaje jugado:%1.2f \tTipo BLACKJACK \tjugados:%d\n",(double)(contBJK*100)/cant,contBJK);
               System.out.printf("Porcentaje jugado:%1.2f \tTipo POKER \tjugados:%d\n",(double)(contPKR*100)/cant,contPKR);
       }
	}

public String inputString(String msg){
    Scanner scanner = new Scanner(System.in);
    System.out.print(msg);
    String str = scanner.nextLine();
    return str;
}

public boolean montoSuficiente(double montoInicial,double montoActual){
    double porcentaje = 20*montoInicial/100;
    if(montoActual<porcentaje)return false;
    if(montoActual < RULETA) return false;//la ruleta es el juego más barato. Si no le alcanza no puede jugar ninguno. 
    return true;
}

public double inputJuego(String msg){
	double value=0;
    Scanner scanner = new Scanner(System.in);
    System.out.print(msg);
    String str = scanner.nextLine();
    while(!str.equals(RUL) && !str.equals(BJK) && !str.equals(PKR)){
        System.out.print("Ingrese nuevamente, solo puede ser RUL/BJK/PKR:");
        str = scanner.nextLine();
    }
    switch(str){
  		case RUL:value =  RULETA;
  		case BJK:value =  BLACKJACK;
  		case PKR:value = POCKER;
   }
    return value;
}

public int jugar(){
    //función otorgada por el docente
    return 0;
}

public double inputDouble(String msg){
    Scanner scanner = new Scanner(System.in);
    System.out.print(msg);
    double num = scanner.nextDouble();
    return num;
}
	
	
}
