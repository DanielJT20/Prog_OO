package interfaces;

public class Moto implements Veiculo{
    @Override
    public String acelerar() {
        return "acelerando a moto";
    }

    @Override
    public String frear() {
        return "freando a moto";
    }
}
