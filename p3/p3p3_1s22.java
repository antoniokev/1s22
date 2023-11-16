import java.util.Scanner;

public class p3p3_1s22{


	public static void cuadrado(int pasada,int valor){
		if (!(pasada==6)) cuadrado(pasada+1,valor*2);
		System.out.println("valor contiene: "+valor);
	}

	public static void main(String[] args) {
		//2*2*2*2*2
		//como puedo elevar al cuadrado un numero x sin utilizar for
		cuadrado(2,2*2);
	}
}