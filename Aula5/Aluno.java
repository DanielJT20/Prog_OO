package Aula5;

    public class Aluno {
        String matricula, nome, curso;

        public Aluno(String id, String name, String course) {
            this.matricula = id;
            this.nome = name;
            this.curso = course;
        }

        public void trocarDeCurso(String novoCurso){
            this.curso = novoCurso;
        }
        public void trocarDeNome(String novoNome) {
            this.nome = novoNome;
        }
    }