package m1s07_2;

public class Preguica extends Animal{

    public Preguica(String nome, String idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Preguiça grunhindo");;
    }

    @Override
    public void movimenta() {
        System.out.println("Preguiça subindo em árvore");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
