package m1s07_1;

/*Implemente a classe Vendedor como subclasse da classe Empregado. Um determinado vendedor tem como  atributos,
        para além dos atributos da classe Pessoa e da classe Empregado, o atributo valorVendas
        (correspondente ao valor monetário dos artigos vendidos) e o atributo comissao
        (porcentagem do valorVendas  que será adicionado ao vencimento base do Vendedor).
        Note que deverá redefinir nesta subclasse o método  herdado calcularSalario
        (o salário de um vendedor é equivalente ao salário de um empregado usual acrescido da  referida comissão).
        Escreva um programa de teste adequado para esta classe.*/

public class Vendedor extends Empregado {

    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public double calculaComissao(){
        double comissao = (getValorVendas() * (getComissao()/100));
        return comissao;
    }
    @Override
    public double calculaImposto(){
        double salario = getSalarioBase() + calculaComissao();
        return (salario * (getImposto()/100));
    }

    @Override
    public double calcularSalario() {
        double salario = getSalarioBase() + calculaComissao();
        return (salario - calculaImposto());
    }

    @Override
    public void folhaSalarial(){
        System.out.println("-------- FOLHA SALARIAL " + getNome() + " --------");
        System.out.println("\nVENCIMENTOS:");
        System.out.printf("Salário base/30 dias trabalhados: R$ %.2f", getSalarioBase());
        System.out.printf("\nComissão por vendas realizadas: R$ %.2f", calculaComissao());
        System.out.printf("\nTotal vencimentos: R$ %.2f", (getSalarioBase()+calculaComissao()));
        System.out.println("\n\nDESCONTOS:");
        System.out.printf("Impostos: R$ %.2f", calculaImposto());
        System.out.println("\n-------------------------------------------------");
        System.out.printf("Vencimento líquido: R$ %.2f", calcularSalario());
        System.out.println("\n-------------------------------------------------");
    }

    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Julius", "Dona Caetana", "2222-2222", 5,
                1300,8,15000,10);

        vendedor.folhaSalarial();
    }

}
