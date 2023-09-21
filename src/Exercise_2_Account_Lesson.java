public class Exercise_2_Account_Lesson {
    private double balance;
    private String name;
    private static int count = 0;

    public Exercise_2_Account_Lesson() {
        this.balance = 0;
        this.count++;
    }

    public Exercise_2_Account_Lesson(double balance) {
        this.balance = balance;
        this.count++;
    }

    public Exercise_2_Account_Lesson(double balance, String name) {
        this.balance = balance;
        this.name = name;
        this.count++;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return  balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double withdraw(double amount) {
        if(this.balance >= amount && amount > 0) {
            this.balance -= amount;
            return amount;
        }
        return 0;
    }

    public double bankWithdrawal(double amount) {
        if(amount > 0) {
            this.balance -= amount;
            return amount;
        }
        return 0;
    }

    public String toString() {
        return "name: " + this.name + " saldo: " + this.balance;
    }



}
