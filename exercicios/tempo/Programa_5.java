package exercicios.tempo;

import javax.swing.*;

public class Programa_5 {
    public static void main(String[] args) {
        int t  = Integer.parseInt(JOptionPane.showInputDialog("Insira o tempo em segundos"));
        int minutos = t/60;
        int horas = minutos/60;

        int minutos2 = minutos - (horas * 60);
        int t2 = t - (minutos * 60);

        JOptionPane.showMessageDialog(null, "Segundos: " + t2 + "\n" + "Minutos: " + minutos2 + "\n" + "Horas: " + horas );
    }
}
