import java.util.Scanner;

class p12_1s22 {
    public static void main(String[] args) {
        java.util.Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.print("escribe un numero: ");
        num1 = teclado.nextInt();

        if (num1%2==0 ) {
            System.out.println("el numero es par");
        }
        else {
            System.out.println("el numero es impar");
        }
    }
}
