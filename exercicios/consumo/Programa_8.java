package exercicios.consumo;

import javax.swing.*;

public class Programa_8 {
    public static void main(String[] args) {

        float kilowatts = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a consumo de energia em Kilowatts"));

        float valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor do Kw/h"));

        float custoReal = (kilowatts*valor);
        float desconto = (custoReal/10);
        float custo = (custoReal-desconto);
        if(custoReal >= 150){
        JOptionPane.showMessageDialog(null, "A sua conta será: R$ " + custoReal);
        }
        else { JOptionPane.showMessageDialog(null, "Sua conta com desconto será: R$ " + custo);}

    }
}
