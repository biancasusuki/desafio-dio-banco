public class Main {

    public static void main(String[] args) {
        Cliente charlote = new Cliente();
        charlote.setNome("Charlote");

        Banco banco = new Banco("Banco XYZ");

        Conta cc = new ContaCorrente(charlote);
        Conta poupanca = new ContaPoupanca(charlote);

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
