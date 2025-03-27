package exercicios.operacoes2;

import javax.swing.*;
import java.util.Objects;

public class Programa_11 {
    public static void main(String[] args) {

        String op = JOptionPane.showInputDialog(null, "Insira uma operação aritimética");
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira outro número"));
        int resultado = 0;
        if (Objects.equals(op, "+")){
            resultado = a + b;
        } else if ( Objects.equals(op, "-")) {
            resultado = a - b;
        }else if ( Objects.equals(op, "*")) {
            resultado = a * b;
        }else if (Objects.equals(op, "/")) {
            resultado = a / b;
        }
        JOptionPane.showMessageDialog(null, "O resultado da operação é: " + a + " " + op +" "+ b + " = " + resultado);
    }
}
