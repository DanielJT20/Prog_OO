package exercicios.arredondar;

import javax.swing.*;

public class Programa_9
{
    public static void main(String[] args) {
        float x = Float.parseFloat(JOptionPane.showInputDialog("Insira um valor real"));
        JOptionPane.showMessageDialog(null, "O valor arredondado é: " + Math.round(x));
        }
    }

