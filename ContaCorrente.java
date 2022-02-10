public class ContaCorrente extends Conta {
    private double taxa;
    public ContaCorrente(int numeroDaAgencia, int numeroDaConta, double taxa){
        this.taxa = taxa;
    }
}