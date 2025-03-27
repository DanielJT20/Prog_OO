package exercicios.operacoes;

import java.util.Scanner;

public class Programa_1_2 {
    public static void main(String[] args) {
        /*      int x, y;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        x = teclado.nextInt();
        System.out.println("Informe o segundo valor: ");
        y = teclado.nextInt();

        System.out.println("Soma = " + (x + y));
        System.out.println("Subtração = " + (x - y));
        System.out.println("Multiplicação = " + (x * y));
        System.out.println("Divisão = " + (x / y));
    }*/

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
