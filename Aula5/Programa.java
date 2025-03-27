package Aula5;

import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("01", "João", "CDIA");
        Aluno aluno2 = new Aluno("02", "Vanessa", "ADS");

        JOptionPane.showMessageDialog(null, "Os alunos são: " + aluno1.nome + " e " + aluno2.nome + "\n" + "Seus cursos são: " + aluno1.curso + " e " + aluno2.curso);
        aluno2.trocarDeCurso("ES");
        aluno1.trocarDeNome("José");
        JOptionPane.showMessageDialog(null, "Os alunos são: " + aluno1.nome + " e " + aluno2.nome + "\n" + "Seus cursos são: " + aluno1.curso + " e " + aluno2.curso);
    }
}
