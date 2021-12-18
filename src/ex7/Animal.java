package ex7;

public class Animal {

    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.println("emitindo som");
    }

    public void movimenta(){
        System.out.println("Animal movimentando");
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", idade='" + idade + " anos" + '\'';
    }
}
