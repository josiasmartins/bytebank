public class TestaContaSemCliente {

    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        Console console = new Console();
        console.consolePulaLinha(contaDaMarcela.saldo);

        contaDaMarcela.titular = new Cliente();
        console.consolePulaLinha(contaDaMarcela.titular);

        contaDaMarcela.titular.nome = "Marcela";
        console.consolePulaLinha(contaDaMarcela.titular.nome);
    }
}
