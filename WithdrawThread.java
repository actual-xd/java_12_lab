public class WithdrawThread extends Thread {
    BankAccount xd;
    double sum_thread;

    WithdrawThread(BankAccount acc, double sum) {
        xd = acc;
        sum_thread = sum;
    }

    @Override
    public void run() {
        if (!(xd.getBalance() - sum_thread > 0)) {
            xd.withdraw(sum_thread);
        } else System.out.println("No money lol");
    }

}

