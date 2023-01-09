public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(22222, 2222);
        Console console = new Console();

        // conta está inconsistente
        conta.setAgencia(12121212);
        // conta.setNumero(-330);

        Conta conta2 = new Conta(121212, 121212);

        console.consolePulaLinha(Conta.getTotal());
    }
}
