import java.util.Scanner;

public class p3p4_1s22{

	 
	public static void cuadrado(int pasada,int valor,int exponente){
		if (!(pasada==exponente)) cuadrado(pasada+1,valor*2,exponente);
		else System.out.println("el resultado es"+valor);
	}

	public static void main(String[] args) {
		//2*2*2*2*2
		//como puedo elevar al cuadrado un numero x sin utilizar for
		Scanner teclado =new Scanner(System.in);

		System.out.println("a cuanto quieres elevar el numero: ");
		int exponente = teclado.nextInt();
		cuadrado(2,2*2,exponente);
	}
}