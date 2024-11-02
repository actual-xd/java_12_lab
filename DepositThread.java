

public class DepositThread extends Thread {
    BankAccount xd;
    double sum_thread;

    DepositThread(BankAccount acc, double sum) {
        xd = acc;
        sum_thread = sum;
    }

    @Override
    public void run() {
        xd.deposit(sum_thread);
    }
}

