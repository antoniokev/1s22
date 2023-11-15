
/*

 metodos
los metodos son elelmentos que realizan una tarea en especifico, este tipo de elementos no regresan algun tipo de valor. podemos dividirnos en dos elementos como son: 

metodos
funciones

las funciones al igual que los metodos realizan una tarea en especifico pero la diferencia esta dada en que esta si regresa un valor por medio de la funcion

los metodos al igual que las funciones estan deberan cumplir con algunas caracteristicas estas son:

alcance: publicas y privadas:
nombre del metodo o funciones:
parametros de entrada: estos se definen en tipo y nombre de variable, el numero de elementos que se pueden colocar como parametro de entrada estara dado por las necesidades del programa

algunos ejemplos son:

metodo:
	public void suma(int a,int b)
	private void suma(int a,int b,int c)

funciones:
	public int suma(int a,int b)
	private double suma(int a,int b)
	public string nombre(string nom, string ap,string am)
*/

import java.util.Scanner;

public class p3p1_1s22{

	static Scanner teclado = new Scanner(System.in);

	public static void Suma(){
		System.out.println("Suma de dos numeros");
		System.out.println("ingresa el primer numero");
		int a = teclado.nextInt();
		System.out.println("ingresa el segundo numero");
		int b = teclado.nextInt();
		int c = a+b;
		System.out.println("el resultado de la suma es"+ c);
	}

	public static void Resta(){
		System.out.println("Resta de dos numeros");
		System.out.println("ingresa el primer numero");
		int a = teclado.nextInt();
		System.out.println("ingresa el segundo numero");
		int b = teclado.nextInt();
		int c = a-b;
		System.out.println("el resultado de la Resta es"+ c);
	}

	public static void Division(){
		System.out.println("Division de dos numeros");
		System.out.println("ingresa el primer numero");
		int a = teclado.nextInt();
		System.out.println("ingresa el segundo numero");
		int b = teclado.nextInt();
		int c = a/b;
		System.out.println("el resultado de la Division es"+ c);
	}

	public static void Multiplicacion(){
		System.out.println("Multiplicacion de dos numeros");
		System.out.println("ingresa el primer numero");
		int a = teclado.nextInt();
		System.out.println("ingresa el segundo numero");
		int b = teclado.nextInt();
		int c = a*b;
		System.out.println("el resultado de la Multiplicacion es"+ c);
	}
	
	public static void menu(){
		System.out.println("menu de Operaciones Basicos");
		System.out.println("\n A) Suma");
		System.out.println(" B) Resta");
		System.out.println(" C) Division");
		System.out.println(" D) Multiplicacion");
		System.out.println("que opcion deseas: ");


	}


	public static void main(String[] args) {
		String opc;
		menu();
		opc = teclado.nextLine();
		if (opc.equals("A")) Suma();
		if (opc.equals("B")) Resta();
		if (opc.equals("C")) Division();
		if (opc.equals("D")) Multiplicacion();
	}
}

