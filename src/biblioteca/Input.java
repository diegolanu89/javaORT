package biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	
	
	private static String ERRORDEFAULT="Error de ingreso de datos\n";
	
	public char inputChar(String msg, String msgError) {
		Scanner sc=new Scanner(System.in);  
		char c;
		try{
			System.out.printf(msg);
	        c = sc.next().charAt(0);
	    } catch (InputMismatchException e){
	    	System.out.printf("\n" + msgError);
	        sc.nextLine();
	        c = sc.next().charAt(0);
	    }
		//sc.close();
		return c;
	}
	
	public char inputChar(String msg, String msgError,String flags) {
		Scanner sc=new Scanner(System.in);  
		char c = 0;
		do {
			try{
				System.out.printf(msg);
		        c = sc.next().charAt(0);
		    } catch (InputMismatchException e){
		    	System.out.printf("\n" + msgError);
		        sc.nextLine();
		        c = sc.next().charAt(0);
		    }
		}while(!flags.contains(String.valueOf(c)));
		return c;
	}
	
	public char inputChar(String msg) {
		Scanner sc=new Scanner(System.in);  
		char c;
		try{
			System.out.printf(msg);
	        c = sc.next().charAt(0);
	    } catch (InputMismatchException e){
	        System.out.printf(ERRORDEFAULT);
	        sc.nextLine();
	        c = sc.next().charAt(0);
	    }
		//sc.close();
		return c;
	}
	
	public int inputInt(String msg, String msgError) {
		Scanner sc=new Scanner(System.in);  
		int num = 0;
			try{
				System.out.printf(msg);
		        num = sc.nextInt();
		    } catch (InputMismatchException e){
		    	System.out.printf("\n" + msgError);
		        sc.nextLine();
		        num = sc.nextInt();
		    }
		//sc.close();
		return num;
	}
	
	public int inputInt(String msg, String msgError,int min) {
		Scanner sc=new Scanner(System.in);  
		int num = 0;
		do {
			try{
				System.out.printf(msg);
		        num = sc.nextInt();
		    } catch (InputMismatchException e){
		    	System.out.printf("\n" + msgError);
		        sc.nextLine();
		        num = sc.nextInt();
		    }
		}while(num<min);
		//sc.close();
		return num;
	}
	
	public int inputInt(String msg) {
		Scanner sc=new Scanner(System.in);  
		int num = 0;
			try{
				System.out.printf(msg);
		        num = sc.nextInt();
		    } catch (InputMismatchException e){
		    	System.out.printf(ERRORDEFAULT);
		        sc.nextLine();
		        num = sc.nextInt();
		    }
		//sc.close();
		return num;
	}
	
	public double inputDouble(String msg, String msgError) {
		Scanner sc=new Scanner(System.in);  
		double num = 0;
			try{
				System.out.printf(msg);
		        num = sc.nextDouble();
		    } catch (InputMismatchException e){
		    	System.out.printf("\n" + msgError);
		        sc.nextLine();
		        num = sc.nextDouble();
		    }
		//sc.close();
		return num;
	}
	
	public double inputDouble(String msg) {
		Scanner sc=new Scanner(System.in);  
		double num = 0;
			try{
				System.out.printf(msg);
		        num = sc.nextDouble();
		    } catch (InputMismatchException e){
		    	System.out.printf(ERRORDEFAULT);
		        sc.nextLine();
		        num = sc.nextDouble();
		    }
		//sc.close();
		return num;
	}
	
	public String inputString(String msg, String msgError) {
		Scanner sc=new Scanner(System.in);  
		String nombre;
		try{
			System.out.printf(msg);
	         nombre = sc.nextLine();
	    } catch (InputMismatchException e){
	    	System.out.printf("\n" + msgError);
	        sc.nextLine();
	        nombre =  sc.nextLine();
	    }
		//sc.close();
		return nombre;
	}
	
	public String inputString(String msg) {
		Scanner sc=new Scanner(System.in);  
		String nombre;
		try{
			System.out.printf(msg);
	         nombre = sc.nextLine();
	    } catch (InputMismatchException e){
	    	System.out.printf(ERRORDEFAULT);
	        sc.nextLine();
	        nombre =  sc.nextLine();
	    }
		//sc.close();
		return nombre;
	}
}
