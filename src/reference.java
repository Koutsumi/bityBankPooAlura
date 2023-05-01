public class reference {
    public static void main(String[] args) {
        account firstAccount = new account();

        firstAccount.saldo = 300;
        System.out.println("Saldo da primeira conta:" + firstAccount.saldo);

        account secondAccount = firstAccount;
        System.out.println("Saldo da segunda conta:" + secondAccount.saldo);

        firstAccount.saldo += 300;
        System.out.println("Saldo da primeira conta:" + firstAccount.saldo);
        System.out.println("Saldo da segunda conta:" + secondAccount.saldo);

        if(firstAccount == secondAccount){
            System.out.println("São a mesma conta");
            System.out.println("Primeira conta:" + firstAccount);
            System.out.println("Segunda conta:" + secondAccount);
        }
    }
}
