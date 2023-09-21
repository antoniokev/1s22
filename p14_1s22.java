import java.util. Scanner;

	public class p14_1s22 {
		public static void main(String [] args) {
		Scanner teclado = new Scanner(System. in);
		String opc;
		int num1, num2;
		int resultado;

	System.out.println("Menu de opciones");
	System.out.println("\n Suma");
	System.out.println("\n Resta");
	System.out.println("\n Division");
	System.out.println("In Multiplicacion");
	System.out.println("Que opcion deseas");
	opc = teclado. nextLine();
	
		switch (opc) {
			case "Suma":
			System.out.println("aqui va la suma");
			System.out.println("ingresa el primer numero; ");
			num1 = teclado.nextInt ();
			System.out .println("ingresa el segundo numero;");
			num2 = teclado.nextInt();
			resultado = num1 + num2;
			System.out.println("el resultado de la suma es; " + resultado);
			break;
			case "Resta":
			System.out.println("aqui va la resta");
			System.out.println("ingresa el primer numero;" );
			num1 = teclado. nextInt();
			System.out.println("ingresa el segundo numero ");
			num2 = teclado.nextInt();
 			resultado = num1 - num2;
			System.out .println("el resultado de la resta es;" + resultado);
			break;
			case "Division":
			System.out.println("aqui va la division");
			System.out .println("ingresa el primer numero; ");
			num1 = teclado.nextInt ();
			System.out.println("ingresa el segundo numero;");
			num2 = teclado.nextInt();
			resultado = num1 / num2;
			System.out.println("el resultado de la division es; " + resultado);
			break;
			case "Multiplicacion":
			System.out.println("aqui va la Multiplicacion");
			System.out .println("ingresa el primer numero; ");
			num1 = teclado. nextInt();
			System.out.println("ingresa el segundo numero: ");
			num2 = teclado.nextInt();
			resultado = num1 * num2;
			System.out.println("el resultado de la multiplicion es; " + resultado);
			break;
			default:
			System.out.println("no existe la opcion");
			break;
		}
	}
}
 