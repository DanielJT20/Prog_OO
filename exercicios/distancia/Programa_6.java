package exercicios.distancia;
import javax.swing.*;

public class Programa_6 {
    public static void main(String[] args) {
        int distancia = Integer.parseInt(JOptionPane.showInputDialog("Qual a distancia rodada?"));
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Qual tempo rodado?"));
        int gasosa = Integer.parseInt(JOptionPane.showInputDialog("Quanto de gasolina gastou?"));
        float velocidadeMedia = (float) (distancia/tempo);
        float consumo = (float) (distancia/gasosa);
        JOptionPane.showMessageDialog(null, "Velocidade média: " + velocidadeMedia + " KM/h" + "\n" + "Consumo de combustivel: " + consumo + " Km/l");

    }
}
