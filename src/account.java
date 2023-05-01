public class account {
    double saldo;
    int agencia = 42;
    int numero;
//    String titular;

    public void deposit(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean withdraw(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfer(double valor, account destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposit(valor);
            return true;
        }
        return false;

    }
}
