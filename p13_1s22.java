import java.util.Scanner;

public class p13_1s22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String operacion;
		int num1;
		int num2;
		int resultado;

		System.out.println("programa que realiza operaciones basicas");
		System.out.println("que operacion desea: suma, resta, multiplicacion, division");
		operacion = teclado.nextLine();

		if (operacion.equals("suma")) {
			System.out.println("aqui debemos una suma");
			System.out.println("ingresa el primer numero; ");
        	num1 = teclado.nextInt();
        	System.out.println("ingresa el segundo numero;");
        	num2 = teclado.nextInt();
        	resultado = num1 + num2;
            System.out.println("el resultado de la suma es; " + resultado);
		}
		else if (operacion.equals("resta")) {
			System.out.println("aqui debemos realizar una resta");
			System.out.println("ingresa el primer numero; ");
        	num1 = teclado.nextInt();
        	System.out.println("ingresa el segundo numero;");
        	num2 = teclado.nextInt();
        	resultado = num1 - num2;
            System.out.println("el resultado de la resta es; " + resultado);
		}
		else if (operacion.equals("multiplicacion")) {
			System.out.println("aqui debemos realizar una multiplicion");
			System.out.println("ingresa el primer numero; ");
        	num1 = teclado.nextInt();
        	System.out.println("ingresa el segundo numero;");
        	num2 = teclado.nextInt();
        	resultado = num1 * num2;
            System.out.println("el resultado de la multiplicion es; " + resultado);
		}
		else if (operacion.equals("division")) {
			System.out.println("aqui debemos realizar una division");
			System.out.println("ingresa el primer numero; ");
        	num1 = teclado.nextInt();
        	System.out.println("ingresa el segundo numero;");
        	num2 = teclado.nextInt();
        	resultado = num1 / num2;
            System.out.println("el resultado de la division es; " + resultado);
		}	
		else {
			System.out.println("No existe opcion a realizar");
		}
	}
}