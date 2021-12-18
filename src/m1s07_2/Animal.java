package m1s07_2;

public class Animal {

    private String nome;
    private String idade;

    public Animal(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.println("emitindo som");
    }

    public void movimenta(){
        System.out.println("Animal movimentando");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }
}
