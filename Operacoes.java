import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        int x, y;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual é o primeiro valor? ");
        x = teclado.nextInt();
        System.out.println("Qual é o segundo valor? ");
        y = teclado.nextInt();
        System.out.println("Soma = " + (x + y));
        System.out.println("Subtração = " + (x - y));
        System.out.println("Divisão = " + (x / y));
        System.out.println("Multiplicação = " + (x * y));
    }
}
