import java.util.Scanner;

public class p3p5_1s22{

	public static int promedio(int a,int b,int c){
		return ((a+b+c)/3);
	}

	public static int[] captura(){
		int[] numeros = new int[10];
		Scanner teclado = new Scanner(System.in);
		for (int a=0;a<10;a++) {
		 	System.out.println("Ingresa el valor para la posicion [" + (a+1)+"]:");
		 	numeros[a]=teclado.nextInt();
		 } 
		 return numeros;
	}

	public static void main(String[] args) {
		int[] valores = captura();
		for (int x=0;x<valores.length;x++) {
			System.out.println("valores contiene en la posicion ["+(x+1)+"]:"+valores[x]);
		}
		System.out.println("El promedio de los tres numeros es: "+ promedio(8,5,9));
		
	}
}

