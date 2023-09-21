public class Exercise_2 {
    public static void main(String[] args) {
        Exercise_2_Account myAccount = new Exercise_2_Account();
        myAccount.setName("Andreas");
        System.out.println(myAccount.getName());
        System.out.println(myAccount);
        myAccount.deposit(1000);
        System.out.println(myAccount);
        myAccount.withdraw(750);
        System.out.println(myAccount);

    }
}