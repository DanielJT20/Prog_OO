import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        int idade, dataNasc;
        float peso;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual é a sua idade ? ");
        idade = teclado.nextInt();
        System.out.printf("Idade = %d\n", idade);
        dataNasc = 2025 - idade;
        System.out.printf("Sua data de nascimento é: " + dataNasc + "\n");
        System.out.println("Qual é o seu peso? ");
        peso = teclado.nextFloat();
        System.out.println("Seu peso é : " + peso + "Kg");
    }
}
