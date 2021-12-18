package m1s07_2;

public class Cavalo extends Animal{

    public Cavalo(String nome, String idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Cavalo relinchando");;
    }

    @Override
    public void movimenta() {
        System.out.println("Cavalo galopando");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
