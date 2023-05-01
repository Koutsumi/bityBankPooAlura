public class testMethod {
    public static void main(String[] args) {
        account myAccount = new account();
        myAccount.saldo = 100;
        myAccount.deposit(50);

        System.out.println("Saldo da conta:" + myAccount.saldo);

        myAccount.withdraw(20);

        System.out.println("Saldo da conta:" + myAccount.saldo);
        
        account friendAccount = new account();
        friendAccount.deposit(1000);
        boolean successTrans = friendAccount.transfer(200, myAccount);
        if(successTrans){
            System.out.println("Transferencia realizada com sucesso");
            System.out.println("Saldo da minha conta:" + myAccount.saldo);
            System.out.println("Saldo da conta do amigo:" + friendAccount.saldo);
        }else{
            System.out.println("Transferencia não realizada" );

        }


    }
}
