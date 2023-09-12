package misClases;

import java.util.Scanner;

public class Heladeria {
	
	  	final static char CHICO = 'C';
	    final static char MEDIANO = 'M';
	    final static char GRANDE = 'G';
	    final static char SALIDA = 'Z';
	    final static int LIMIT_G = 20;
	    final static int MAX_GUSTOS = 4;
	    final static int COMISION = 50;


		public Heladeria() {		
			 int cantGustos = 0;
	           int monto = 0;
	           String comprador = "";
	           String nombreGusto = "";
	           char tam;
	           int calorias = 0;

	           //Se desea saber por cada pedido cuál es el gusto con menos calorías de ese pedido y en qué orden se lo agregó.
	           int orden = 0;
	           int minCalorias = Integer.MAX_VALUE;
	           String nombreMinCalorias = "";

	        //Cantidad de pedidos por tamaño.
	           int contG = 0;
	           int contM = 0;
	           int contC = 0;

	        //Promedio importe entre todas las compras
	           int suma = 0;
	           int pedidos = 0;

	        //Cuál fue el pedido más caro y quien lo compró.
	           int pedidoCaro = 0;
	           String compradorCaro = "";
	           
	           tam = inputVolumen("Ingrese el tamaño del pedido:");
	           

               while(contM<=20 && tam!=SALIDA ){

                       cantGustos = inputGustos("Ingresar Cantidad de gustos:");
                       monto = inputInt("Ingrese el monto a pagar del pedido:");
                       comprador = inputString("Ingrese el nombre del comprador:");

                       for(int i=0;i<cantGustos;i++){
                           calorias = inputInt("Ingresar Calorias:");
                           nombreGusto = inputString("Ingrese nombre del gusto:");
                           if(calorias < minCalorias){
                               minCalorias = calorias;
                               orden = i+1;
                               nombreMinCalorias = nombreGusto;
                           }
                       }
                       System.out.printf("Gusto menos calórico:%s\t Ingresado en el orden:%d\n",nombreMinCalorias,orden);
                       minCalorias = Integer.MAX_VALUE;

                        switch(tam){
                           case CHICO:contC++;
                           case MEDIANO:contM++;
                           case GRANDE:contG++;
                       }

                       if(monto>pedidoCaro){
                           pedidoCaro=monto;
                           compradorCaro=comprador;
                       }

                       suma+=monto;
                       pedidos++;

                   tam = inputVolumen("Ingrese el tamaño del pedido:");
               }
            System.out.printf("Tamaño:%s \t Pedidos:%d\n",CHICO,contC);
            System.out.printf("Tamaño:%s \t Pedidos:%d\n",MEDIANO,contM);
            System.out.printf("Tamaño:%s \t Pedidos:%d\n",GRANDE,contG);
            System.out.printf("Promdio de ventas %1.2f\n",(double)suma/pedidos);
            System.out.printf("Pedido más caro:%d \tComprado por:%s\n",pedidoCaro,compradorCaro);
            System.out.printf("Porcentaje de pedidos C respecto al total:%1.2f\n",(double)contC*100/pedidos);
	    }

		public char inputVolumen(String msg){
	        Scanner sc = new Scanner(System.in);
	        System.out.print(msg);
	        char c = sc.next().charAt(0);
	        while(c!=GRANDE && c!=MEDIANO && c!=CHICO && c!=SALIDA){
	            System.out.print("Ingrese nuevamente, solo puede ser G/M/C/Z:");
	            c = sc.next().charAt(0);
	        }
	        return c;
	    }

	    public String inputString(String msg){
	        Scanner sc = new Scanner(System.in);
	        String str="";
	        System.out.print(msg);
	        str = sc.nextLine();
	        return str;
	    }

	    public int inputInt(String msg){
	        Scanner sc = new Scanner(System.in);
	        System.out.print(msg);
	        int num = sc.nextInt();
	        return num;
	    }

	      public int inputGustos(String msg){
	        Scanner sc = new Scanner(System.in);
	        int num=0;
	        do{
	            System.out.print(msg);
	            num = sc.nextInt();
	        }while(num<1 && num >4);
	        return num;
	    }
	
	
}
