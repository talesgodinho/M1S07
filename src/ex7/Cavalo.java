package ex7;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("relinchando");;
    }

    @Override
    public void movimenta() {
        System.out.println("galopando");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
