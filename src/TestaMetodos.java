public class TestaMetodos {

    public static void main(String[] args) {
        Conta conta = new Conta();
        //conta.pegaSaldo() = 100;
        conta.deposita(50);

        System.out.println(conta.getSaldo());
        boolean conseguiuRetirar = conta.saca(20);
        System.out.println(conta.getSaldo());
        System.out.println(conseguiuRetirar);

        Conta contaDaMaria = new Conta();
        contaDaMaria.deposita(1000);

        boolean sucessoTransferencia = contaDaMaria.transfere(3000, conta);
        if (sucessoTransferencia) {
            System.out.println("transferência com sucesso");
        } else {
            System.out.println("faltou dinheiro");
        }
        System.out.println(contaDaMaria.getSaldo());
        System.out.println(conta.getSaldo());

        //conta.titular = "paulo silveira";
        System.out.println(conta.getTitular());
    }

}
