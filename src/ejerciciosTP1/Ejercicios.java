package ejerciciosTP1;
import java.util.*;
import java.util.Map.Entry;
import javax.swing.JOptionPane;

public class Ejercicios {
	
	/*
	 * 1. Realizá un programa que permita que el usuario ingrese su nombre. El programa debe emitir
		  una salida con un mensaje de bienvenida que incluya el nombre ingresado. [EC]
	 * */
	
	public void ejercicio1() {
		System.out.print("\n\t***EJERCICIO 1***\n");  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Ingrese su nombre ");  
		String nombre = sc.nextLine();
		System.out.print("Bienvenido " + nombre);  
	}
	/*
	 * 2. Realizá un programa que permita ingresar 3 notas pertenecientes a tres trimestres distintos
			para cierto alumno de nivel secundario. Debe calcularse y mostrarse la nota promedio. [EC]
	 * */
	public void ejercicio2() {
		System.out.print("\n\t***EJERCICIO 2***\n"); 
		Scanner sc=new Scanner(System.in);  
		System.out.print("Ingrese Nota 1° Cuatrimestre :");  
		int a = sc.nextInt();
		System.out.print("Ingrese Nota 2° Cuatrimestre :");  
		int b = sc.nextInt();
		System.out.print("Ingrese Nota 3° Cuatrimestre :");  
		int c = sc.nextInt();
		System.out.print("Promedio: " + (a+b+c)/3);  
	}
	
	
	/*
	 * 3. Realizá un programa que permita ingresar un número entero. Debe mostrarse el número
		ingresado:
		a. Multiplicado por 5.
		b. Dividido por 2.
	 * */
	public void ejercicio3() {
		System.out.print("\n\t***EJERCICIO 3***\n");
		Scanner sc=new Scanner(System.in);  
		System.out.print("Ingrese Número entero :");  
		int a = sc.nextInt();
		System.out.print("Multiplicado por 5: " + (a*5) + " - Dividido por 2: " + (a/2));  
	}
	
	
	/*
	 * 4. Realizá un programa que permita ingresar el valor monetario de una hora de trabajo y la
		cantidad de horas trabajadas por día por un trabajador. Debes mostrar el valor del salario
		semanal, sabiendo que trabaja todos los días hábiles y la mitad de las horas del día hábil los
		sábados. (Todas las horas valen lo mismo.)
	 * */
	public void ejercicio4() {
		System.out.print("\n\t***EJERCICIO 4***\n");
		Scanner sc=new Scanner(System.in);  
		System.out.print("Ingrese valor de hora de trabajo :");  
		double a = sc.nextDouble();
		System.out.print("Ingrese horas trabajadas por día :");  
		int b = sc.nextInt();
		System.out.print("Salario Semanal :"  +  (((float)11/(float)2)* (float)b)*a);  
	}
	
	/*
	 * 5. Realizá un programa que permita ingresar valores del mismo tipo para las variables num1 y
		num2. Una vez cargadas, mostrar ambas variables por pantalla, intercambiá sus valores (que
		lo cargado en num1 quede en num2, y viceversa) y volvé a mostrarlas actualizadas. [EC]
	 * */
	public void ejercicio5() {
		System.out.print("\n\t***EJERCICIO 5***\n");
		double  aux = 0;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Ingrese num1 :");  
		double a = sc.nextDouble();
		System.out.print("Ingrese num2 :");  
		double b = sc.nextDouble();
		System.out.print("Num1: " + a + " - Num2: " + b); 
		aux = a;
		a = b;
		b = aux;
		System.out.print("Num1: " + a + " - Num2: " + b); 
	}
	
	/*
	 * 6. Realizá un programa que permita ingresar el monto total de las ventas realizadas por un
		vendedor durante el mes, de quien se sabe que gana un sueldo fijo de 44000 pesos más el 16
		por ciento del monto total vendido. Con tales datos debes calcular y mostrar el importe a
		cobrar por el vendedor.
	 * */
	public void ejercicio6() {
		System.out.print("\n\t***EJERCICIO 6***\n");
		final double sueldo = 44000; //supongamos que son constantes del programa principal. 
		final double porcentaje = 0.16;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Ingrese el monto de ventas mensuales :");  
		double a = sc.nextDouble();
		System.out.print("Cobro del vendedor:" + (sueldo + a*porcentaje)); 
		
	}
	
	/*
	 * 7. Realizá un programa que permita ingresar el ancho y el largo de un terreno en metros y el
		valor del metro cuadrado de tierra. Debe mostrarse el valor total del terreno y la cantidad de
		metros de alambre para cercarlo completamente a tres alturas distintas.
	 * */
	public void ejercicio7() {
		System.out.print("\n\t***EJERCICIO 7***\n");
		Scanner sc=new Scanner(System.in);  
		System.out.print("Ingrese ancho del terreno :");  
		double ancho = sc.nextDouble();
		System.out.print("Ingrese largo del terreno :");  
		double largo = sc.nextDouble();
		System.out.print("Ingrese valor del metro cuadrado del terreno :");  
		double precio = sc.nextDouble();
		double valor = (ancho * largo) * precio;
		double perimetro = 2*(ancho + largo);
		System.out.print("Valor del terrno:" + valor + " Metros de alambrado:" + perimetro); 
	}
	
	/*
	 * 8. Realizá un programa que permita ingresar dos números naturales. Debes mostrar los
		resultados para las 4 operaciones matemáticas básicas con los números ingresados. [EC]
	 * */
	private int leerNumeroNatural(int i) {
		Scanner sc=new Scanner(System.in);  
		int num = 0;
		do {
			try{
		        System.out.printf("Ingrese número %d natural:", i);
		        num = sc.nextInt();
		    } catch (InputMismatchException e){
		        System.out.printf("Debe Ingresar un número %d entero natural obligatoriamente:", i);
		        sc.nextLine();
		        num = sc.nextInt();
		    }
		}while(num <= 0); 
		return num;
	}
	
	public void ejercicio8(){
		System.out.print("\n\t***EJERCICIO 8***\n");
		int num1 = leerNumeroNatural(1);
		int num2 = leerNumeroNatural(2);
		System.out.printf("Suma:%d \n", (num1 + num2));
		System.out.printf("Resta:%d \n", (num1 - num2));
		System.out.printf("Multiplicación:%d \n", (num1 * num2));
		System.out.printf("División:%d \n", (num1 / num2));
	}
	
	/*
	 * 9. Realizá un programa que permita ingresar dos números que representan las medidas en
			grados de dos ángulos interiores de cierto triángulo. A partir de los valores de estos dos
			ángulos el programa debe mostrar el valor en grados del ángulo restante. Recordá que la
			suma de los ángulos interiores de todo triángulo es de 180º.
	 * 
	 * */
	
	private double leerAngulo(int i) {
		Scanner sc=new Scanner(System.in);  
		double num = 0;
		do {
			try{
		        System.out.printf("Ingrese ángulo %d:", i);
		        num = sc.nextDouble();
		    } catch (InputMismatchException e){
		        System.out.printf("Debe Ingresar un número para el angulo %d : ",i);
		        sc.nextLine();
		        num = sc.nextDouble();
		    }
		}while(num >= 180); 
		return num;
	}
	
	public void ejercicio9() {
		System.out.print("\n\t***EJERCICIO 9***\n");
		double ang1 ,ang2;
		do {
			ang1 = leerAngulo(1);
			ang2 = leerAngulo(2);
			if(ang1 + ang2 >= 180)System.out.printf("***Los angulos suman >=180°, reintentar*** \n");
		}while((ang1 + ang2) >= 180);
		System.out.printf("Ángulo restante: %1.2f \n", ((double)180 - ang1 - ang2) );
	}
	
	
	/*
	 * 10. Realizá un programa que permita resolver el siguiente problema: Tres personas aportan
		diferente capital a una sociedad y desean saber el valor total aportado y qué porcentaje
		aportó cada una (indicando nombre y porcentaje). Solicitar la carga por teclado del nombre
		de cada socio, su capital aportado y a partir de esto calcular e informar lo requerido
		previamente.
	 * 
	 * */
	
	private double inputDouble(int i) {
		Scanner sc=new Scanner(System.in);  
		double num = 0;
			try{
		        System.out.printf("Ingrese número %d:", i);
		        num = sc.nextDouble();
		    } catch (InputMismatchException e){
		        System.out.printf("Debe Ingresar un número %d : ",i);
		        sc.nextLine();
		        num = sc.nextDouble();
		    }
		return num;
	}
	
	private String inputString() {
		Scanner sc=new Scanner(System.in);  
		String nombre;
		try{
	        System.out.printf("Ingrese valor:");
	         nombre = sc.nextLine();
	    } catch (InputMismatchException e){
	        System.out.printf("Debe Ingresar un valor: ");
	        sc.nextLine();
	        nombre =  sc.nextLine();
	    }
		return nombre;
	}
	
	public void ejercicio10() {
		System.out.print("\n\t***EJERCICIO 10***\n");
		int inputs = 3;
		String[] nombres = new String[inputs];
		double[] montos = new double[inputs];
		double total = 0;
		String p = "%";
		for(int i=0;i<inputs;i++) {
			System.out.printf("[Nombre %d]",i+1);
			nombres[i]= inputString();
			System.out.printf("[Monto aportado por %s]",nombres[i]);
			total+= montos[i]= inputDouble(i+1);
		}
		for(int i=0;i<inputs;i++) {
			System.out.printf("%s aporto el %1.2f%s: \n",nombres[i],(montos[i]*(double)100)/total,p);
		}
	}
	
	/*
	 * 11 - Realizá un programa que permita ingresar un número entero e indique si se trata de un
			número par o impar
	 * 
	 * */
	
	private int inputNumberInt() {
		Scanner sc=new Scanner(System.in);  
		int num = 0;
			try{
		        System.out.printf("Ingrese número :");
		        num = sc.nextInt();
		    } catch (InputMismatchException e){
		        System.out.printf("Debe Ingresar un número:");
		        sc.nextLine();
		        num = sc.nextInt();
		    }
		return num;
	}
	
	public void ejercicio11() {
		System.out.print("\n\t***EJERCICIO 11***\n");
		Scanner sc=new Scanner(System.in);
		int num;
		num = inputNumberInt();
		if(num%2==0)System.out.printf("El número ingresado es par \n");
		else System.out.printf("El número ingresado es impar \n");
	}
	
	/*
	 * 12. Realizá un programa que permita ingresar dos números enteros e indique cuál de ellos es el
		mayor. [EC]
	 * */
	public void ejercicio12() {
		System.out.print("\n\t***EJERCICIO 12***\n");
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		num1 = inputNumberInt();
		num2 = inputNumberInt();
		if(num1>num2)System.out.printf("El primer número es más grande (%d > %d) \n", num1,num2);
		else if (num2 == num1) System.out.printf("Son iguales (%d == %d) \n", num2,num1);
		else System.out.printf("El segundo número es más grande (%d > %d) \n", num2,num1);
			
	}
	
	/*
	 * 13. Realizá un programa para ingresar tres números enteros e indique cuál de ellos es el mayor y
		su valor. [EC]
	 * */
		public void ejercicio13() {
			System.out.print("\n\t***EJERCICIO 13***\n");
			int mayor = 0;int aux = 0;
			mayor = inputNumberInt();
			for(int i=0;i<2;i++) {
				aux = inputNumberInt();
				if(aux>mayor)mayor=aux;
			}
			System.out.printf("El mayor número es =>%d) \n", mayor);
		}
		
		
		/*
		 * 14. Para entrar a la montaña rusa Infierno en las alturas se requiere tener al menos 7 años y medir
			más de 1,50 metros. Completá el siguiente cuadro a mano según los requisitos y luego
			escribí el programa que permita, ejecutándolo cada vez para cada niño y según las edades y
			estaturas ingresadas por el usuario, obtener los mismos resultados para los siguientes datos:
			[EC]
		 * 
		 * */
		
		private double inputDouble() {
			Scanner sc=new Scanner(System.in);  
			double num = 0;
				try{
			        System.out.printf("Ingrese número:");
			        num = sc.nextDouble();
			    } catch (InputMismatchException e){
			        System.out.printf("Debe Ingresar un número:");
			        sc.nextLine();
			        num = sc.nextDouble();
			    }
			return num;
		}
		
		private boolean continuar() {
			Scanner sc=new Scanner(System.in);  
			System.out.printf("\nIngresar otro? y/n :");
			String esc;
			do {
				 esc = sc.nextLine();
				 switch(esc) {
				 case "y":return true;
				 case "n":return false;
				 default:System.out.printf("\nIngresar otro? y/n :");
				 }
			}while(esc!="y" || esc!="n");
			 return false;
		}
		
		public void ejercicio14() {
			System.out.print("\n\t***EJERCICIO 14***\n");
			int edad;
			double estatura;
			do {
				System.out.printf("[EDAD]");
				edad = inputNumberInt();
				System.out.printf("[ESTATURA]");
				estatura = inputDouble();
				if(edad>=7 && estatura >1.50)System.out.printf("Entra al juego\n");
				else System.out.printf("NO Entra al juego\n");
			}while(continuar());
			return;
		}
		
		/*
		 * 15. Para entrar a la montaña rusa Miedo a las alturas, algo más chica y tranquila que la anterior,
			alcanza con que se cumpla solamente una de las siguientes condiciones: ser mayor de 6 años
			o medir más de 1,50 metros. Realizá el mismo procedimiento que con el ejercicio anterior
			pero con los nuevos requisitos. [EC]
		 * */
		
		public void ejercicio15() {
			System.out.print("\n\t***EJERCICIO 15***\n");
			int edad;
			double estatura;
			do {
				System.out.printf("[EDAD]");
				edad = inputNumberInt();
				System.out.printf("[ESTATURA]");
				estatura = inputDouble();
				if(edad>6 || estatura >1.50)System.out.printf("Entra al juego\n");
				else System.out.printf("NO Entra al juego\n");
			}while(continuar());
			return;
		}
	
	
	
		/*
		 * 16. Realizá un programa que permita ingresar la cantidad de inscriptos a una conferencia y la
			cantidad de asientos disponibles en el auditorio. Debes indicar si alcanzan los asientos, Si los
			asientos no alcanzaran indicar cuántos faltan para que todos los inscriptos puedan sentarse.
		 * */
		
		public void ejercicio16() {
			System.out.print("\n\t***EJERCICIO 16***\n");
			int inscriptos,asientos;
			System.out.printf("[Asientos]");
			asientos = inputNumberInt();
			System.out.printf("[Inscriptos]");
			inscriptos = inputNumberInt();
			if(inscriptos > asientos)System.out.printf("Asientos faltantes:%d",inscriptos - asientos);
			else System.out.printf("Asientos suficientes");
		}
		
		
		
		/*
		 * 17. Realizá un programa que permita ingresar una edad (entre 1 y 120 años) y un género ('F'
			para mujeres, 'M' para hombres). En caso de haber ingresado valores erróneos (edad fuera
			de rango o género inválido), informar tal situación y terminar el programa. Si los datos están
			bien ingresados el programa debe indicar, sabiendo que las mujeres se jubilan con 60 años o
			más y los hombres con 65 años o más, si la persona está en edad de jubilarse.
		 * 
		 * */
		
		private char inputChar() {
			Scanner sc=new Scanner(System.in);  
			char c ;
				try{
			        System.out.printf("Ingrese valor :");
			        c = sc.next().charAt(0);
			    } catch (InputMismatchException e){
			        System.out.printf("Debe Ingresar un valor:");
			        sc.nextLine();
			        c = sc.next().charAt(0);
			    }
			return c;
		}
		
		private boolean check(int e, char g) {
			if((g=='M' && e>=65)||(g=='F' && e>=60))return true;
			return false;
		}
		
		private boolean datosCorrectos(int e,char g) {
			if((e>0 && e<=120)&&(g=='M'||g=='F'))return true;
			return false;
		}
	
		public void ejercicio17() {
			System.out.print("\n\t***EJERCICIO 17***\n");
			int edad;
			char genero;
			System.out.printf("[EDAD]");
			edad = inputNumberInt();
			System.out.printf("[GENERO F/M]");
			genero = inputChar();
			if(datosCorrectos(edad,genero)) {
				if(check(edad,genero))System.out.printf("Esta en edad de jubilación");
				else System.out.printf("No Esta en edad de jubilación");
			}
			else {
				System.out.printf("Datos incorrectos");
				return;
			}
		}
	
	/*
	 * 18. Realizá un programa que permita al usuario ingresar dos números enteros. La computadora
		debe indicar si el mayor es divisible por el menor. (Un número entero a es divisible por un
		número entero b cuando el resto de la división entre a y b es 0.
	 * */
		
		//FORMA COMÚN
		private int mayor(int num1,int num2) {
			if(num1>num2)return num1;
			else if(num1<num2)return num2;
			else return num1;
		}
		
		private int menor(int num1,int num2) {
			if(num1>num2)return num2;
			else if(num1<num2)return num1;
			else return num2;
		}
		
		//HASHMAP
		
		private Map<String, Integer> mayorYmenor(int a, int b) {
			Map<String, Integer> ord = new HashMap<String, Integer>();
			if(a>b) {
				ord.put("Mayor", a);
				ord.put("Menor", b);
			}else if(a<b) {
				ord.put("Mayor", b);
				ord.put("Menor", a);
			}
			ord.put("Mayor", a); //default para iguales
			ord.put("Menor", b);
			return ord;
		}
		
		
		public void ejercicio18() {
			System.out.print("\n\t***EJERCICIO 18***\n");
			int num1,num2;
			Map<String, Integer> numeros;
			System.out.printf("[Numero 1]");
			num1 = inputNumberInt();
			System.out.printf("[Numero 2]");
			num2 = inputNumberInt();
			numeros = mayorYmenor(num1,num2);
			if(numeros.get("Mayor") % numeros.get("Menor")==0) {
				System.out.printf("Es divisible %d por %d\n",numeros.get("Mayor"),numeros.get("Menor"));
				return;
			}
			System.out.printf("No Es divisible  %d por %d\n",numeros.get("Mayor"),numeros.get("Menor"));
		}
		
		/*
		 * 19. Existen dos reglas que identifican dos conjuntos de valores:
			a. El número es de un solo dígito.
			b. El número es impar.
				A partir de estas reglas, realizá un programa que permita ingresar un número entero. Debe
				asignar el valor que corresponda a las variables booleanas esDeUnSoloDigito, esImpar,
				estaEnAmbosGrupos y noEstaEnNingunGrupo el valor Verdadero o Falso, según corresponda,
				para indicar si el valor número ingresado pertenece o no a cada conjunto. Al terminar el
				programa debe informar el número cargado y las cuatros variables lógicas. Definí un lote de
				prueba de varios números y probá el algoritmo, escribiendo los resultados tal como se hizo
				en los ejercicios anteriores.
		 * 
		 * 
		 * */
		public void ejercicio19() {
			System.out.print("\n\t***EJERCICIO 19***\n");
			int num;
			boolean esDeUnSoloDigito=false,esImpar=false,estaEnAmbosGrupos=false,noEstaEnNingunGrupo=false;
			System.out.printf("[Numero]");
			num = inputNumberInt();
			if((int)(Math.log10(num)+1) == 1)esDeUnSoloDigito=true;
			if(num%2!=0)esImpar=true;
			if(esImpar && esDeUnSoloDigito)estaEnAmbosGrupos=true;
			if(!esImpar && !esDeUnSoloDigito)noEstaEnNingunGrupo=true;
			System.out.printf("Número:%d \nEs de un solo dígito:%b\nEs impar:%b\nEsta en ambos grupos:%b\nNo esta en ambos grupos:%b\n",num,esDeUnSoloDigito,esImpar
					,estaEnAmbosGrupos,noEstaEnNingunGrupo);
			
		}
		/*
		 * 20. Realizá un programa que permita ingresar dos números enteros y la operación a realizar
			('+', '-', '*', '/'). Debe mostrarse el resultado para la operación ingresada. Considerar
			que no se puede dividir por cero (en ese caso mostrar el texto 'ERROR'). [EC]
		 * */
		
		private char inputOperation() {
			Scanner sc=new Scanner(System.in);  
			char c ;
			do {
				try{
			        System.out.printf("Ingrese valor :");
			        c = sc.next().charAt(0);
			    } catch (InputMismatchException e){
			        System.out.printf("Debe Ingresar un valor:");
			        sc.nextLine();
			        c = sc.next().charAt(0);
			    }
			}while(c!='+' && c!='-' && c!='*' && c!='/');
			return c;
		}
		
		public void ejercicio20() {
			System.out.print("\n\t***EJERCICIO 20***\n");
			int num1,num2;
			char op;
			System.out.printf("[Numero 1]");
			num1 = inputNumberInt();
			System.out.printf("[Numero 2]");
			num2 = inputNumberInt();
			System.out.printf("[Ingrese operación('+', '-', '*', '/')]");
			op = inputOperation();
			switch(op) {
				case '+':
						System.out.printf("%d + %d=%d",num1,num2,num1+num2);
						break;
				case '-':	System.out.printf("%d - %d=%d",num1,num2,num1-num2);
						break;
				case '*':	System.out.printf("%d * %d=%d",num1,num2,num1*num2);
						break;
				case '/':	if(num2 == 0)System.out.printf("Error división por cero");
							else System.out.printf("%d / %d:%d",num1,num2,num1/num2);
							break;
			}
			return;
		}
		
		/*
		 * 21. Realizá un programa que permita al usuario ingresar un número entero entre 1 y 7. Debe
			mostrarse por pantalla el nombre del día de la semana que representa tal número tomando
			como el primer día de la semana el Domingo. De ingresar un número fuera de rango debe
			mostrar error.
		 * */
		public void ejercicio21() {
			System.out.print("\n\t***EJERCICIO 21***\n");
			String dias[]={"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
			int num;
			System.out.printf("[Numero del día]");
			num = inputNumberInt();
			if(num>=1 && num<=7) {
				System.out.printf("El día ingresado es:%s\n",dias[num-1]);
			}else {
				System.out.printf("Error fuera de rango\n");
			}
			
		}
		
		/*
		 * 22. Realizá un programa que muestre todos los números enteros del 1 al 5, y luego los mismos
			números pero en orden inverso. [EC]
		 * */
		
		public void ejercicio22() {
			System.out.print("\n\t***EJERCICIO 22***\n");
			System.out.printf("Numeros del al 5: [");
			for(int i=0;i<5;i++) {
				System.out.printf("%s\t",i+1);
			}
			System.out.printf("]\nNumeros del al 5 invertido: [");
			for(int i=5;i>0;i--) {
				System.out.printf("%s\t",i);
			}
			System.out.printf("]");
		}
		
		/*
		 * 23. Realizá un programa que permita ingresar un número entero n. Debe mostrar los primeros
			10 múltiplos de n (desde 1 x n).
		 * 
		 * */
		public void ejercicio23() {
			System.out.print("\n\t***EJERCICIO 23***\n");
			int num;
			System.out.printf("[Numero]");
			num = inputNumberInt();
			for(int i=0;i<10;i++) {
				System.out.printf("Multiplo %d => %d\n",i+1,(i+1)*num);
			}
		}
		
		/*
		 * 24. Realizá un programa que permita al usuario ingresar dos números enteros num1 y num2,
			donde el primero siempre deberá ser menor o igual al segundo. La computadora debe
			mostrar la secuencia de números existentes entre ambos:
			a. Incluyéndolos;
			b. Excluyéndolos.
		 * */
		public void ejercicio24() {
			System.out.print("\n\t***EJERCICIO 24***\n");
			int num1,num2;
			do {
				System.out.printf("[Numero 1]");
				num1 = inputNumberInt();
				System.out.printf("[Numero 2]");
				num2 = inputNumberInt();
				if(num1>num2)System.out.printf("Primer numero debe ser menor que el segundo");
			}while(num1>num2);
			for(int i=num1+1;i<num2;i++) {
				System.out.printf("%d\t",i);
			}
		}
		
		/*
		 * 25. Realizá un programa que permita ingresar dos números enteros que representen el ancho y
			el alto de una matriz de cruces. El programa debe dibujar dicha matriz.
		 * */
		public void ejercicio25() {
			System.out.print("\n\t***EJERCICIO 25***\n");
			int num1,num2;
			System.out.printf("[Ancho]");
			num1 = inputNumberInt();
			System.out.printf("[alto]");
			num2 = inputNumberInt();
			for(int i=0;i<num2;i++) {
				for(int j=0;j<num1;j++) {
					System.out.printf("X\t");
				}
				System.out.printf("\n");
			}
		}
		
		
		/*
		 * 26. Realizá un programa que permita al usuario ingresar un número natural n. La computadora
			debe mostrar los primeros n múltiplos de 3 excepto aquellos que sean a la vez múltiplos de
			5.
		 * */
		
		public void ejercicio26() {
			System.out.print("\n\t***EJERCICIO 26***\n");
			int n,m;
			n=leerNumeroNatural(1);
			for(int i=0;i<n;i++) {
				m = 3*(i+1);
				if(m%5!=0)
					System.out.printf("%d",m);
			}
		}
		
		
		/*
		 * 27. Realizá un programa que permita ingresar 5 edades. Calcular y mostrar el promedio de todas
		las edades ingresadas y cuántas edades fueron valores impares mayores que 18. [EC]
		 * 
		 * */
		public void ejercicio27() {
			System.out.print("\n\t***EJERCICIO 27***\n");
			int suma=0,num,imp=0,n;
			
			for(int i=0;i<5;i++) {
				System.out.printf("[EDAD]");
				n=leerNumeroNatural(1);
				if(n>18 && n%2!=0) imp++;
				suma+=n;
			}
			System.out.printf("Promedio:%d",suma/5);
			System.out.printf("Impares mayores a 18:%d",imp);
		}
		/*
		 * 28. Realizá un programa que a partir de un número entero cant ingresado por el usuario permita
		cargar por teclado cant números enteros. La computadora debe mostrar cuál fue el mayor
		número y en qué posición apareció.
		 * 
		 * */
		public void ejercicio28() {
			System.out.print("\n\t***EJERCICIO 28***\n");
			int max=0, pos,n,num;
			System.out.printf("[Cantidad]");
			n=leerNumeroNatural(1);
			for(int i=0;i<n;i++) {
				System.out.printf("[Numero]");
				num = inputNumberInt();
				if(i==0) {
					max=num;
					pos=1;
				}else {
					if(num>max) {
						max=num;
						pos=i+1;
					}
				}
			}
			System.out.printf("[Numero Máximo] : %d",max);
		}
		
		/*
		 * 29. Realizá un programa que permita validar la nota de un examen. Se espera que la nota que el
		usuario ingrese sea un número comprendido entre 0 y 10. La misma debe ser ingresada
		tantas veces como sea necesario hasta que quede comprendida dentro del rango indicado.
		[EC]
		 * 
		 * */
		public void ejercicio29() {
			System.out.print("\n\t***EJERCICIO 29***\n");
			int n;
			do {
				n=leerNumeroNatural(1);
			}while(n<0 || n>10);
			System.out.printf("[NOTA VALIDADA]");
		}
		
		/*
		 * 30. Realizá un programa que permita realizar varias operaciones matemáticas ingresando un
		caracter por cada una la operación a realizar (‘+’, ‘-’, ‘*’, ‘/’, ‘F’) y dos números enteros en el caso
		que no haya elegido ‘F’. La computadora debe mostrar el resultado para la operación
		ingresada. Considerar que no se puede dividir por cero. Cuando la operación ingresada sea ‘F’
		nos indicará que no se desean calcular más operaciones. [EC]
		 * 
		 * */
		private final char SUMA='+';
		private final char RESTA='-';
		private final char MULTIPLICACION='*';
		private final char DIVISION='/';
		private final char SALIR='F';
		
		private char inputOperationF() {
			Scanner sc=new Scanner(System.in);  
			char c ;
			do {
				try{
			        System.out.printf("Ingrese valor :");
			        c = sc.next().charAt(0);
			    } catch (InputMismatchException e){
			        System.out.printf("Debe Ingresar un valor:");
			        sc.nextLine();
			        c = sc.next().charAt(0);
			    }
			}while(c!=SUMA && c!=RESTA && c!=MULTIPLICACION && c!=DIVISION && c!=SALIR );
			return c;
		}
		
		public void ejercicio30() {
			System.out.print("\n\t***EJERCICIO 30***\n");
			int num1,num2;
			char op;
			System.out.printf("[Ingrese operación('+', '-', '*', '/','F')]");
			op = inputOperationF();
			
			if(op!=SALIR) {
				System.out.printf("[Numero 1]");
				num1 = inputNumberInt();
				System.out.printf("[Numero 2]");
				num2 = inputNumberInt();
				switch(op) {
					case SUMA:
						System.out.printf("%d + %d=%d",num1,num2,num1+num2);
						break;
					case RESTA:	System.out.printf("%d - %d=%d",num1,num2,num1-num2);
						break;
					case MULTIPLICACION:	System.out.printf("%d * %d=%d",num1,num2,num1*num2);
						break;
					case DIVISION:	if(num2 == 0)System.out.printf("Error división por cero");
							else System.out.printf("%d / %d=%d",num1,num2,num1/num2);
							break;
				}
			}
			return;
		}
		
	/*
	 * 31. Realizá un programa que permita validar una opción ingresada. Se le preguntará al usuario si
	desea continuar con alguna operación de la forma "¿Deseás continuar? [S/N]". Se
	espera que el usuario ingrese una 'S' o una 'N' (incluir las minúsculas). La opción debe ser
	ingresada tanto como sea necesario hasta que quede comprendida dentro de las
	posibilidades esperadas. Realizá este ejercicio en dos versiones (A y B): con ciclo while y
	con ciclo do-while.
 * 
	 * */
		private final char SALIDA='n';
		private final char CONTINUAR='s';
		private char inputSN() {
			Scanner sc=new Scanner(System.in);  
			char c ;
			do {
				try{
			        System.out.printf("Ingrese [S/N] :");
			        c = sc.next().charAt(0);
			    } catch (InputMismatchException e){
			        System.out.printf("Debe Ingresar un valor [S/N]:");
			        sc.nextLine();
			        c = sc.next().charAt(0);
			    }
			}while(Character.toLowerCase(c)!=SALIDA && Character.toLowerCase(c)!=CONTINUAR);
			return Character.toLowerCase(c);
		}
		
		public void ejercicio31() {
			System.out.print("\n\t***EJERCICIO 31***\n");
			char op;
			op=inputSN();
			switch(op) {
			case SALIDA:
				System.out.print("SALIDA\n");
				break;
			case CONTINUAR:
				System.out.print("CONTINUAR\n");
				break;
			}
		}
		
		
		/*
	32. Realizá un programa que permita validar la nota de un examen de la misma manera que el
	ejercicio 29 pero con las siguientes nuevas directivas:
	● Las notas 1 y 3 no usan nunca.
	● La nota 0 se reserva para los ausentes
	En resumen, las notas válidas pueden ser un 2 o un valor entre 4 y 10. [EC]
		 * 
	 * */
		
		public void ejercicio32() {
			System.out.print("\n\t***EJERCICIO 32***\n");
			int num;
			do {
				System.out.printf("[Ingresar Nota]");
				num = leerNumeroNatural(1);
			}while(num!=2 && (num<4 || num>10));
			System.out.printf("[Nota Validada] =>%d\n",num);
		}



		/*
	33. Realizá un programa que permita al usuario ingresar números hasta que se introduzca un 0.
	La computadora debe mostrar el número máximo y el número mínimo. [EC]
 * 
	 * */
	public void ejercicio33() {
		System.out.print("\n\t***EJERCICIO 33***\n");
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,num;
		System.out.printf("[Cantidad]");
		do {
			num = inputNumberInt();
			if(num>max)max=num;
			if(num<min)min=num;
		}while(num!=0);
		System.out.printf("[Numero Máximo] : %d\n",max);
		System.out.printf("[Numero Mínimo] : %d",min);
	}



		/*
	34. Realizá un programa que permita ingresar la estatura (en metros con decimales) de cada
	jugador de un equipo de baloncesto. La carga finalizará al ingresar cero. Calcular y mostrar la
	estatura promedio del equipo.
 * 
	 * */
	public void ejercicio34() {
		System.out.print("\n\t***EJERCICIO 34***\n");
		double num,suma=0,prom;
		int cantJugadores=0;
		do {
			System.out.printf("[Ingresar Altura de jugador %d]",cantJugadores+1);
			num = inputDouble();
			if(num!=0) {
				cantJugadores++;
				suma+=num;
			}
		}while(num!=0);
		System.out.printf("Estatura Promedio:%1.2f\n",suma/(float)cantJugadores);
	
	}




		/*
	35. Realizá un programa que permita ingresar nombre y edad de un grupo de personas (para
	cada una, nombre y edad). La carga termina cuando en el nombre de la persona se ingresa un
	asterisco ('*'). Mostrar al final cómo se llama la persona más joven.
 * 
	 * */
	private final String ASTERISCO="*";
	public void ejercicio35() {
		System.out.print("\n\t***EJERCICIO 35***\n");
		int n, edad;
		int edadJoven=Integer.MAX_VALUE;
		String nombre;
		String nombreJoven="";
		do {
			System.out.print("[INGRESE NOMBRE]");
			nombre=inputString();
			if(nombre.charAt(0)!='*') {
				System.out.print("[INGRESE EDAD]");
				edad= leerNumeroNatural(1);
				if(edad<edadJoven && nombre.charAt(0)!='*') {
					edadJoven=edad;
					nombreJoven = nombre;
				}
			}
		}while (nombre.length()!=1 && nombre.charAt(0)!='*');
		if(nombreJoven!= "") {
			System.out.printf("El mas joven es %s con una edad de %d\n",nombreJoven,edadJoven);
		}
	}


		/*
	36. Realizá un programa que permita ingresar números mientras el promedio entre todos los
	ingresados sea menor a 20. Al terminar el ingreso indicar la cantidad de valores leídos. [EC]
 
	 * */
	public void ejercicio36() {
		System.out.print("\n\t***EJERCICIO 36***\n");
		double num,suma=0,prom;
		int cont=1;
		do {
			num = inputDouble();
			suma+=num;
			prom = suma/(float)cont;
			if(prom<20)cont++;
		}while(prom<20);
		System.out.printf("Cantidad de Valores leidos:%d\n",cont);
	}


		/*
	37. Realizá un programa que permita al usuario ingresar hasta 12 valores, de a uno por vez, que
	representan los sueldos mensuales que percibió un empleado durante un año calendario. Si
	durante la carga de los sueldos mensuales se detecta un valor negativo, esto indica que aún
	no se ha cobrado el mes en curso, y en ese caso se debe dejar de ingresar datos. Al finalizar
	mostrar el monto percibido por el empleado hasta ese momento (total o parcial).
 * 
	 * */
	public void ejercicio37() {
		System.out.print("\n\t***EJERCICIO 37***\n");
		double num=0,suma=0;
		for(int i = 0;i<12 && num>=0;i++) {
			num = inputDouble();
			if(num>=0)suma+=num;
		}
		System.out.printf("Monto cobrado hasta el momento:%1.2f", suma);
	}
		/*
	38. Realizá un programa que permita controlar con validación el ingreso a un sitio web. Teniendo
	ya precargados un nombre de usuario ("admin") y una contraseña ("123456"), el programa
	debe permitir al usuario ingresar sus credenciales. Si las mismas son erróneas, se volverán a
	pedir hasta un máximo de 3 intentos. Finalmente, la computadora debe mostrar alguno de los
	siguientes mensajes según sea el caso: "Acceso concedido" o "Se ha bloqueado la
	cuenta".
	 * 
	 * */
	
	private final int INTENTOS = 3;
	
	public enum Habilitacion {
	    ACTIVADA("\nAcceso concedido\n"),
	    DESACTIVADA("\nSe ha bloqueado la cuenta\n");

		private String status;
		 
	    private Habilitacion(String i) {
	        this.status = i;
	    }
	 
	    public String getStatus() {
	        return status;
	    }
	}
	
	public void ejercicio38() {
		System.out.print("\n\t***EJERCICIO 38***\n");
		int n=INTENTOS;
		String nombre,clave;
		Habilitacion status = Habilitacion.ACTIVADA;
		
		
		for(int i =0; i<INTENTOS; i++) {
			System.out.print("[INGRESAR USUARIO]");
			nombre=inputString();
			System.out.print("[INGRESAR CLAVE]");
			clave=inputString();
			if(nombre.equals("admin") && clave.equals("123456")) break;
			if(i ==(INTENTOS-1))status=Habilitacion.DESACTIVADA;
			
		}
		System.out.print(status.getStatus());
		
	}		
		
		
	 /*
	  * 39. Nos proponemos desarrollar un “Tiro al blanco” en el cual 2 o más participantes realizan 3
		disparos consecutivos cada uno. Cada tiro, dependiendo de la distancia al centro da un
		puntaje que se acumula (se suman los tres disparos). Gana el jugador con mayor puntaje (se
		supone único).
		La puntuación para cada tiro es la siguiente:
		● Si la distancia respecto al centro es 0 se ganan 500 puntos;
		● Si la distancia es <= a 10, se ganan 250;
		● Si la distancia está entre 11 y 50 ganará 100 puntos;
		● Si es mayor no ganará nada (cayó fuera del tablero).
		La mecánica del juego es la siguiente:
		Se pide la cantidad de jugadores (mayor o igual a 2).
		Por cada jugador:
		● Ingresar el nombre
		● Ingresar la distancia de cada uno de sus tres tiros consecutivos (número mayor o igual
		a cero), calculando para cada uno de estos el puntaje obtenido.
		Se pide:
		● Informar el nombre del participante ganador del torneo y su puntaje (suponer único
		máximo)
		● Informar la cantidad total de tiros al centro.
	  * 
	  * 
	  * */
		private final int MAX_PUNTAJE = 500, MED_PUNTAJE=250,MIN_PUNTAJE=100;
		
		private int checkPuntaje(int p) {
			if(p==0)return MAX_PUNTAJE;
			if(p<=10)return MED_PUNTAJE;
			if(p>=11 && p<=50)return MIN_PUNTAJE;
			return 0;
		}
		
		private int ejecutarTiros(int n) {
			int puntaje = 0;
			for(int i = 0;i<n;i++) {
				System.out.printf("[Distancia %d]:",i+1);
				puntaje+=checkPuntaje(inputNumberInt());
			}
			return puntaje;
		}
		
		private int inputNumberJugadores() {
			Scanner sc=new Scanner(System.in);  
			int num = 0;
			do {
				try{
			        System.out.printf("Ingrese número :");
			        num = sc.nextInt();
			    } catch (InputMismatchException e){
			        System.out.printf("Debe Ingresar un número:");
			        sc.nextLine();
			        num = sc.nextInt();
			    }
			}while(num<2);
			return num;
		}
		
		
		public void ejercicio39() {
			System.out.print("\n\t***EJERCICIO 39***\n");
			int cantidadJugadores = 0,cantidadtiros=3;
			String nombre;
			Map<String, Integer> jugadores = new HashMap<String, Integer>();
			System.out.printf("[Cantidad de jugadores]");
			cantidadJugadores =  inputNumberJugadores();
			for(int i=0;i<cantidadJugadores;i++) {
				System.out.printf("[Nombre %d]",i+1);
				jugadores.put(inputString(), ejecutarTiros(cantidadtiros));
			}
	        System.out.printf("Cantidad total de tiros al centro:%d\n",cantidadJugadores*3); 
	        int maxValueInMap=(Collections.max(jugadores.values()));  
	        for (Entry<String, Integer> entry : jugadores.entrySet()) {
	            if (entry.getValue()==maxValueInMap) {
	                System.out.printf("Maximo puntaje: %s\t %d pts\n",entry.getKey(),entry.getValue()); 
	                break;
	            }
	        }
		}
		
		
		
		
		
		private final char SI = 'S', NO='N', BLANCO='B', ESCAPE='F';
		
		private int inputNumberEdad() {
			Scanner sc=new Scanner(System.in);  
			int num = 0;
			do {
				try{
			        System.out.printf("Ingrese edad :");
			        num = sc.nextInt();
			    } catch (InputMismatchException e){
			        System.out.printf("Debe Ingresar un número:");
			        sc.nextLine();
			        num = sc.nextInt();
			    }
			}while(num<18);
			return num;
		}
		
		private char inputVoto() {
			Scanner sc=new Scanner(System.in);  
			char voto;
			do {
				try{
			        System.out.printf("Ingrese voto:");
			         voto  = sc.next().charAt(0);
			    } catch (InputMismatchException e){
			        System.out.printf("Debe Ingresar un valor: ");
			        sc.nextLine();
			        voto =  sc.next().charAt(0);
			    }
			}while(voto!=SI || voto!=NO || voto!=BLANCO || voto!=ESCAPE);
			return voto;
		}
		
		public void simulacro() {
			
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
			
			
		}
}





