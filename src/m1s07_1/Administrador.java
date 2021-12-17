package m1s07_1;

//Implemente a classe Administrador como subclasse da classe Empregado.
//        Um determinado administrador tem como atributos, para além dos atributos da classe Pessoa e da classe Empregado,
//        o atributo ajudaDeCusto  (ajudas referentes a viagens, estadias, ...).
//        Note que deverá redefinir na classe Administrador o método herdado  calcularSalario
//        (o salário de um administrador é equivalente ao salário de um empregado usual acrescido das  ajudas de custo).
//        Escreva um programa de teste adequado para esta classe.

public class Administrador extends Empregado{

    private double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return (super.calcularSalario() + getAjudaDeCusto());
    }

    public static void main(String[] args) {
        Administrador administrador = new Administrador("Joseclides", "Bento Gonçaves", "3222-2222", 22, 1322.47, 8, 375);

        System.out.printf(administrador.getNome() + " possui salário base de R$ %.2f, imposto de %.2f%s e ajuda de custos de R$ %.2f, ficando com o salário líquido: R$ %.2f.",
                administrador.getSalarioBase(), administrador.getImposto(), "%", administrador.getAjudaDeCusto(), administrador.calcularSalario());
    }

}
