public class Exercise_2_Account {
    private double balance;
    private String name;

    public Exercise_2_Account(double balance){
        this.balance = balance;
    }
    public Exercise_2_Account(){
        this.balance = 0;
    }
    public Exercise_2_Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return "Name: " + this.name + " Balance: " + this.balance;
    }
}
