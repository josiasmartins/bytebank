public class CriaConta {

    public static void main(String[] args) {
        // new Conta: instância um objeto do tipo Conta
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        // imprime no console
        // System.out.println(primeiraConta.saldo);
        primeiraConta.saldo += 100;
        // System.out.println(primeiraConta.saldo);
        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);
    }
}