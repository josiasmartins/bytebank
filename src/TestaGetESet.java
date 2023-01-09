public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(2222, 2222);
        Console console = new Console();
        conta.setNumero(1337);
        console.consolePulaLinha(conta.getNumero());

        Cliente paulo = new Cliente();
        paulo.setNome("paulo silveira");

        conta.setTitular(paulo);

        console.consolePulaLinha(conta.getTitular());

        conta.getTitular().setProfissao("programador");
        // agora em duas linhas
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");

        console.consolePulaLinha(titularDaConta);
        console.consolePulaLinha(paulo);
        console.consolePulaLinha(conta.getTitular());
    }


}
