package m1s07_1;

/*Implemente a classe Operario como subclasse da classe Empregado. Um determinado operário tem como  atributos,
        para além dos atributos da classe Pessoa e da classe Empregado, o atributo valorProducao
        (que  corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e comissao
        (que  corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário).
        Note que  deverá redefinir nesta subclasse o método herdado calcularSalario (o salário de um operário é
        equivalente ao  salário de um empregado usual acrescido da referida comissão).

        Escreva um programa de teste adequado para  esta classe.*/

import jdk.swing.interop.SwingInterOpUtils;

public class Operario extends Empregado{

    private double valorProducao;
    private double comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        setValorProducao(valorProducao);
        setComissao(comissao);
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calculaComissao(){
        double comissao = (getValorProducao() * (getComissao()/100));
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
        System.out.printf("\nComissão por produção realizada: R$ %.2f", calculaComissao());
        System.out.printf("\nTotal vencimentos: R$ %.2f", (getSalarioBase()+calculaComissao()));
        System.out.println("\n\nDESCONTOS:");
        System.out.printf("Impostos: R$ %.2f", calculaImposto());
        System.out.println("\n-------------------------------------------------");
        System.out.printf("Vencimento líquido: R$ %.2f", calcularSalario());
        System.out.println("\n-------------------------------------------------");
    }

    public static void main(String[] args) {
        Operario operario = new Operario("Roberval", "Rua Anita Garibaldi", "3232-3232",
                13, 1200,8,1600,5);
        operario.folhaSalarial();
    }

}
