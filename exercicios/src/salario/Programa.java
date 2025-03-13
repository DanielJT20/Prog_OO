package salario;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu salário: ");
        float salario = teclado.nextFloat();
        System.out.println("Informe o percentual de aumento: ");
        float percentual = teclado.nextFloat();

        float aumento = (percentual/100 * salario);
        float novoSalario = (salario + aumento);

        System.out.println("O novo salário será de: R$" + novoSalario + "\nO aumento é de: R$" + aumento);
    }
}
