public class BankApp {
    public static void main(String[] args) {
        BankAccount bank_acc = new BankAccount();
        System.out.println("Balance: " + bank_acc.getBalance());
        DepositThread deposit = new DepositThread(bank_acc, 500);
        WithdrawThread withdraw = new WithdrawThread(bank_acc, 200);

        DepositThread deposit_1 = new DepositThread(bank_acc, 200);


        deposit.start();
        withdraw.start();
        deposit_1.start();


        try {
            deposit.join();

            withdraw.join();
            deposit_1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Balance: " + bank_acc.getBalance());
    }


}
