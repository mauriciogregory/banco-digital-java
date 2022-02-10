public class Conta {

    private int numeroDaConta;
    private int numeroDaAgencia;
    private String titular;
    private double saldo;

    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public int getNumeroDaAgencia() {
        return numeroDaAgencia;
    }

    public void setNumeroDaAgencia(int numeroDaAgencia) {
        this.numeroDaAgencia = numeroDaAgencia;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void imprimir(){
        System.out.println("O saldo é de: " + this.saldo);
    }

}