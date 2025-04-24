package control;

import model.Aluno;
import model.Monitor;
import model.Pessoa;
import model.Professor;

public class Programa {
    public static void main(String[] args) {
    //    Pessoa pessoa1 = new Pessoa();
    //    pessoa1.nome = "João";
    //    pessoa1.telefone = "2402-8922";
    //    System.out.println("\nNome: " + pessoa1.nome);
    //    System.out.println("Telefone: " + pessoa1.telefone);

        Pessoa pessoa2 = new Pessoa("Miguel", "1232544366");
        System.out.println("\nNome: " + pessoa2.getNome());
        System.out.println("Telefone: " + pessoa2.getTelefone());

    //    Pessoa pessoa3 = new Pessoa("João");
    //    System.out.println("\nNome: "+ pessoa3.nome);

        Aluno aluno1 = new Aluno("Lucas", "2000-3000", "2024000000");
    //    aluno1.nome = "Lucas";
    //    aluno1.telefone = "2000-3000";
        System.out.println("\nNome: " + aluno1.getNome());
        System.out.println("Telefone: " + aluno1.getTelefone());

        Professor professor1 = new Professor("Thiago", "Doutor", "3000-4000");
      //  professor1.nome = "Thiago";
       // professor1.titulacao = "Doutor";
       // professor1.telefone = "5000-4000";
        professor1.setNome("Rafael");
        System.out.println("\nProfessor: " + professor1.getNome() + ", Titulaçao: " + professor1.getTitulacao() + ", Telefone: " + professor1.getTelefone() + ".");

        Monitor monitor1 = new Monitor("Rafael", "4002-8922", "2023000000", 20);
        System.out.println("\nNome: " + monitor1.getNome() + ", Telefone: " + monitor1.getTelefone() + ", Matricula: " + monitor1.getMatricula() + ", Percentual de bolsa: " + monitor1.getPercentualBolsa() + "%");
        //System.out.println("\nPercentual de bolsa: "+ monitor1.percentualBolsa + "%");
        //monitor1.percentualBolsa = Double.parseDouble(JOptionPane.showInputDialog("Insira o percentual de bolsa: "));
        //JOptionPane.showMessageDialog(null, "Bolsa monitor: " + monitor1.percentualBolsa + "%");
      //  System.out.println("\nPercentual de bolsa: " + monitor1.percentualBolsa + "%");
    }
}
