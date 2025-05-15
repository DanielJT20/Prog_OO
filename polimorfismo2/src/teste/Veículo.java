package teste;


import static java.lang.Math.random;

public class Veículo {
    public void Acelerar() {
    }
    public void Frear() {
    }
    public static void main(String[] args) {
       Veículo meuveiculo1 = new Moto();
       Veículo meuveiculo2 = new Carro();

       random().Acelerar();
        random().Frear();

    }

    private static Veículo random() {
        return ;
    }


}
