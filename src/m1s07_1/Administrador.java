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
    public double calculaImposto(){
        double salario = getSalarioBase() + getAjudaDeCusto();
        return (salario * (getImposto()/100));
    }

    @Override
    public double calcularSalario() {
        return ((getSalarioBase()+getAjudaDeCusto()) - calculaImposto());
    }

    @Override
    public void folhaSalarial(){
        System.out.println("-------- FOLHA SALARIAL " + getNome() + " --------");
        System.out.println("\nVENCIMENTOS:");
        System.out.printf("Salário base/30 dias trabalhados: R$ %.2f", getSalarioBase());
        System.out.printf("\nAjuda de custos: R$ %.2f", getAjudaDeCusto());
        System.out.printf("\nTotal vencimentos: R$ %.2f", (getSalarioBase()+getAjudaDeCusto()));
        System.out.println("\n\nDESCONTOS:");
        System.out.printf("Impostos: R$ %.2f", calculaImposto());
        System.out.println("\n-------------------------------------------------");
        System.out.printf("Vencimento líquido: R$ %.2f", calcularSalario());
        System.out.println("\n-------------------------------------------------");
    }
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Joseclides", "Bento Gonçaves", "3222-2222", 22, 1322.47, 8, 375);
        administrador.folhaSalarial();
    }

}
