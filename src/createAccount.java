public class createAccount {

    public static void main(String[] args){
        account firstAccount = new account();

        System.out.println("Primeira conta");
        System.out.println("Agência: " + firstAccount.agencia);
        System.out.println("Conta: " + firstAccount.numero);


        firstAccount.saldo = 200;
        System.out.println(firstAccount.saldo);

        firstAccount.saldo += 100;
        System.out.println(firstAccount.saldo);


        System.out.println("Segunda conta");

        account secondAccount = new account();
        secondAccount.agencia = 142;
        System.out.println("Agência: " + secondAccount.agencia);
        System.out.println("Conta: " + secondAccount.numero);

        secondAccount.saldo = 50;
        System.out.println(secondAccount.saldo);

        if(firstAccount == secondAccount){
            System.out.println("São a mesma conta");
        }else if(firstAccount != secondAccount){
            System.out.println("Nao são a mesma conta");
            System.out.println("Primeira conta:" + firstAccount);
            System.out.println("Segunda conta:" + secondAccount);
        }
    }

}
