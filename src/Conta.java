public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    // metodo no java
    public void deposita(double valor) {
        this.saldo += valor;
    }

    // metodo saca no Java
    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}
// TODO: novo objeto;