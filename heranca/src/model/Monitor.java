package model;

public class Monitor extends Aluno {
    private double percentualBolsa;

    public Monitor(String nome, String telefone, String matricula, double bolsa){
        super(nome, telefone, matricula);
        this.percentualBolsa = bolsa;
    }

    public double getPercentualBolsa() {
        return percentualBolsa;
    }
}

