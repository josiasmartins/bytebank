public class TesteSacaNegativo {

    public static void main(String[] args) {
        Console console = new Console();
        Conta conta = new Conta(1337, 22222);
        conta.deposita(100);
        console.consolePulaLinha(conta.saca(200));

        console.consolePulaLinha(conta.getSaldo());

    }
}
