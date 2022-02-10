public class ContaCorrente extends Conta {
    private double taxa;
    public ContaCorrente(int numeroDaAgencia, int numeroDaConta, double taxa){
        super();
        this.taxa = taxa;
    }

    public void descontaTaxa(int taxa){
        this.taxa = taxa;
        System.out.println(getSaldo() - this.taxa);
    }
}