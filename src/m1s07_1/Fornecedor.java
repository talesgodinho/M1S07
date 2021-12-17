package m1s07_1;

/*
Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor.
        Considere  que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa,
        os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) e
        valorDivida (montante da  dívida para com o fornecedor). Implemente na classe Fornecedor,
        para além dos usuais métodos seletores e  modificadores, um método obterSaldo() que devolve a diferença
        entre os valores dos atributos valorCredito e  valorDivida. Depois de implementada a classe Fornecedor,
        crie um programa de teste adequado que lhe permita  verificar o funcionamento dos métodos implementados
        na classe Fornecedor e os herdados da classe Pessoa.
*/

public class Fornecedor extends Pessoa {

    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        setValorCredito(valorCredito);
        setValorDivida(valorDivida);
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo(){
        return (getValorCredito() - getValorDivida());
    }


    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Maria Luiza", "Rua Tiradentes", "98888-8888", 50000, 35000);
        System.out.printf(fornecedor.getNome() + " possui crédito de R$ %.2f e dívida de R$ %.2f ficando com o saldo total: R$ %.2f",
                fornecedor.getValorCredito(), fornecedor.getValorDivida(), fornecedor.obterSaldo());
    }
}


