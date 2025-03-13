package operacoes;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        float x, y;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        x = teclado.nextFloat();
        System.out.println("Informe o segundo valor: ");
        y = teclado.nextFloat();

        System.out.println("Soma = " + (x + y));
        System.out.println("Subtração = " + (x - y));
        System.out.println("Multiplicação = " + (x * y));
        System.out.println("Divisão = " + (x / y));
    }
}
