import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        if((n % 2) == 0){
            JOptionPane.showMessageDialog(null,"O número é par");
        }
        else {JOptionPane.showMessageDialog(null,"O número é impar");
        }
    }
}
