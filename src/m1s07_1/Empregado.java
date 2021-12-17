package m1s07_1;

//Considere, como subclasse da classe Pessoa, a classe Empregado.
//        Considere que cada instância da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa,
//        os atributos codigoSetor (inteiro),  salarioBase (vencimento base) e imposto (porcentagem retida dos impostos).
//        Implemente a classe Empregado  com métodos seletores e modificadores e um método calcularSalario.
//        Escreva um programa de teste adequado  para a classe Empregado.


public class Empregado extends Pessoa{

    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calculaImposto(){
        return (getSalarioBase() * (getImposto()/100));
    }

    public double calcularSalario(){
        return (getSalarioBase() - calculaImposto());
    }

    public void folhaSalarial(){
        System.out.println("-------- FOLHA SALARIAL " + getNome() + " --------");
        System.out.println("\nVENCIMENTOS:");
        System.out.printf("Salário base/30 dias trabalhados: R$ %.2f", getSalarioBase());
        System.out.printf("\nTotal vencimentos: R$ %.2f", getSalarioBase());
        System.out.println("\n\nDESCONTOS:");
        System.out.printf("Impostos: R$ %.2f", calculaImposto());
        System.out.println("\n-------------------------------------------------");
        System.out.printf("Vencimento líquido: R$ %.2f", calcularSalario());
        System.out.println("\n-------------------------------------------------");
    }

    public static void main(String[] args) {
        Empregado empregado = new Empregado("Stanislau", "Getulio Vargas", "3222-2222", 12, 1280.76, 8);
        empregado.folhaSalarial();
    }

}
