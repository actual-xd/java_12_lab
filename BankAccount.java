import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance = 0;


    public synchronized void deposit(double sum) {
        balance = balance + sum;
    }

    public  synchronized void  withdraw(double sum) {
        balance = balance - sum;
    }

    public double getBalance() {
        return balance;
    }
}

