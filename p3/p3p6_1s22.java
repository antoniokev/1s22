import java.util.Scanner;

public class p3p6_1s22{

	public static int promedio(int a,int b,int c){
		int[] valores = captura();
		
		int sum=0;
		for (int a=0;a<valores.length;a++) {
			sum += valores[a];
		}
		int promedio = sum/valores.length;
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
		int[] valor = promedio();
		System.out.println("el promedio de los diez valores es :" + promedio(promedio));
		
	}
}
