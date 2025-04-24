package model;

public class Pessoa {

    private String nome;
    private String telefone;

    // metodo construtor padrão (vazio e sem parâmetros)
    // Um metodo construtor é responsavel por instanciar objetos,
    // realizando atribuição de valores aos atributos e alocação
    // de memória.
    public Pessoa(){

    }
    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    public Pessoa(String nome){
        this.nome = nome;
    }

    public void mudarTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
