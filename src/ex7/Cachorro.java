package ex7;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("latindo");;
    }

    @Override
    public void movimenta() {
        System.out.println("correndo");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
