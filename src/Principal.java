public class Principal {
    public static void main(String[] args) {
        ContaCorrente c = new ContaCorrente(12,344,10);
        ContaPoupanca cp = new ContaPoupanca(2,455, 0.56);

        cp.depositar(200);
        cp.calculaRendimento();

        c.depositar(100);
        c.depositar(200);
        c.imprimir();
        c.sacar(120);
        c.imprimir();
    }
}