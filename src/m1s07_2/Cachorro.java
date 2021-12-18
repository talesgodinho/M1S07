package m1s07_2;

public class Cachorro extends Animal{

    public Cachorro(String nome, String idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Cachorro latindo");;
    }

    @Override
    public void movimenta() {
        System.out.println("Cachorro correndo");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
