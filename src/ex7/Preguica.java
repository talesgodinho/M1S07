package ex7;

public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("grunhindo");;
    }

    @Override
    public void movimenta() {
        System.out.println("subindo em árvore");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
