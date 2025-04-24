package model;

public class Professor extends Pessoa {
    private String titulacao;

    public Professor(String nome, String titulacao ,String telefone){
        //a cláusula super() repassa os parametros exigidos pelo
        //construtor da superclasse.
        super(nome, telefone);
        this.titulacao = titulacao;
    }

    public void mudarTitulacao(String titulacao){
    this.titulacao = titulacao;
}

    public void setNome(String rafael) {
    }

    public String getTitulacao() {
        return titulacao;
    }
}
