package tdd;

 public class Account {
    private double balance;

    public void depositAmount(double amount) {
        if (amount <= 0) {
            this.balance = balance;
        } else if (amount > 0) {
            this.balance = balance + amount;
        }

    }

    public void setBalance() {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
        }

    public void withdrawAmount(double amount) {
        balance -= amount;
    }


    }

