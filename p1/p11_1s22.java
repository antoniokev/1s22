import java.util.Scanner;

class p11_1s22 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int edad;

		System.out.println("introduce tu edad: ");
		edad = teclado.nextInt();

		if (edad >= 18) {
			System.out.println("eres mayor de edad");
		}
		else{
			System.out.println("eres menor de edad");
		}
		// +, -- raiz, potencia, residuo de division

		System.out.println("raiz cuadada de 10: " + Math.sqrt(10));
		System.out.println("potencia " + Math.pow(5,2));
		//5 numero 2 la potencia
		System.out.println("residuo de 10/2" + (10%2));
		System.out.println("residuo de 10/2" + (11%2));
	}
}
