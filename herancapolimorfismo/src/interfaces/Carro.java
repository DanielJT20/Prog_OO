package interfaces;

public class Carro implements Veiculo{
    @Override
    public String acelerar() {
        return "Acelerando o carro";
    }

    @Override
    public String frear() {
        return "Freando o carro";
    }
}
