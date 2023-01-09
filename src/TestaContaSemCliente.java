public class TestaContaSemCliente {

    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta(2222, 222);
        Console console = new Console();
        console.consolePulaLinha(contaDaMarcela.getSaldo());

        contaDaMarcela.setTitular(new Cliente());
        console.consolePulaLinha(contaDaMarcela.getTitular());

        Cliente cliente = new Cliente();
        cliente.setNome("maria");
        contaDaMarcela.setTitular(cliente);
        console.consolePulaLinha(contaDaMarcela.getTitular().getNome());
    }
}
