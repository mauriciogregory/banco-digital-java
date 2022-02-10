public class ContaPoupanca extends Conta {
    private  double rendimento;

    public ContaPoupanca(int numeroDaConta, int numeroDaAgencia, double rendimento){
        super();
        this.rendimento = rendimento;
    }

    public void calculaRendimento(){
        System.out.println(((getSaldo() * rendimento)/100) + getSaldo());
    }
}