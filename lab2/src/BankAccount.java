public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        if(balance<0){System.out.println("nie.");}else
        {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Prosze wprowadzić poprawną wartość");
        } else {
            balance += amount;
            System.out.println("Kwota: " + amount + " zł została dodana do konta. Aktualna wartość środków na koncie to: " + balance + " zł.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Prosze wprowadzić poprawną wartość");
        } else if (amount > balance) {
            System.out.println("Niewystarczające środki na koncie. Aktualna wartość środków na koncie to: " + balance + " zł.");
        } else {
            balance -= amount;
            System.out.println(amount + " zł zostało poprawnie wypłacone z konta. Aktualna wartość środków na koncie to: " + balance + " zł.");
        }

    }

    public static void main(String[] args)
    {
        BankAccount bankAccount2 = new BankAccount(-1863);
        BankAccount bankAccount = new BankAccount(2);
        bankAccount.withdraw(283750965);
        bankAccount.deposit(0.5);
        bankAccount.deposit(-0.6);
        bankAccount.withdraw(0.01);
    }
}
