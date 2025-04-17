import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.telefone = "2402-8922";
        System.out.println("\nNome: " + pessoa1.nome);
        System.out.println("Telefone: " + pessoa1.telefone);

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Lucas";
        aluno1.telefone = "2000-3000";
        System.out.println("\nNome: " + aluno1.nome);
        System.out.println("Telefone: " + aluno1.telefone);

        Professor professor1 = new Professor();
        professor1.nome = "Thiago";
        professor1.titulacao = "Doutor";
        professor1.telefone = "3000-4000";
        System.out.println("\nProfessor: " + professor1.nome + ", Titulaçao: " + professor1.titulacao + ", Telefone :" + professor1.telefone + ".");
        Monitor monitor1 = new Monitor();
        //System.out.println("\nPercentual de bolsa: "+ monitor1.percentualBolsa + "%");
        monitor1.percentualBolsa = Double.parseDouble(JOptionPane.showInputDialog("Insira o percentual de bolsa: "));
        JOptionPane.showMessageDialog(null, "Bolsa monitor: " + monitor1.percentualBolsa + "%");
        System.out.println("\nPercentual de bolsa: " + monitor1.percentualBolsa + "%");
    }
}
