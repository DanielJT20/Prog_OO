package sobrescrita;

public class Cachorro extends Animal {

    @Override
    void emitirSom() {
        System.out.println("Au au");
    }
}