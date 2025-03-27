package exercicios.circulo;

import java.util.Scanner;

public class Programa_4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double perimetro, raio, area;

        System.out.println("Informe o raio do circulo: ");

        raio = teclado.nextFloat();

        perimetro = ((2 * Math.PI) * raio);
        area = (Math.PI * Math.pow(raio,2));

        System.out.println("O perímetro é : " + perimetro + "\n A área é: " + area);

    }
}
