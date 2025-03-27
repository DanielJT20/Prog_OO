package exercicios.exec_ab;

import javax.swing.*;

public class Programa_12 {
    public static void main (String [] args){
     int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro "));
     int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira outro valor inteiro "));
     int inicio = Math.min(a, b);
     int fim = Math.max(a, b);
     int soma = 0;
     int count = 0;
    StringBuilder resultadoSoma = new StringBuilder();


     for (int i = inicio; i <= fim ; i++){
         if ((i % 2) == 0){
             resultadoSoma.append(i).append(" ");
             soma += i;
             count++;
         }

     }
     double media = (double) soma / count;
        JOptionPane.showMessageDialog(null, "Esses são os números pares: " + resultadoSoma);
        JOptionPane.showMessageDialog(null, "Essa é a soma dos números: " + soma);
        JOptionPane.showMessageDialog(null, "Essa é a média dos números: " + media);
    }
}
