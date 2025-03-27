package exercicios.maiorMenor;

import javax.swing.*;

public class Programa_10 {
    public static void main(String[] args) {
        int n, x, y;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor inteiro: "));
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor inteiro menor: "));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor inteiro maior: "));
        if (n < x) {
            JOptionPane.showMessageDialog(null, "O valor " + n + " está antes do intervalo");
        } else if (n > y) {
            JOptionPane.showMessageDialog(null, "O valor " + n + " está depois do intervalo");
        } else if (n <= y && n >= x) {
            JOptionPane.showMessageDialog(null, "O valor " + n + " está dentro do intervalo");
        }
    }
}
