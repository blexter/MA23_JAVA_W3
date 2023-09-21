import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_2_Lesson {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        /*Exercise_2_Account_Lesson davidsAcc = new Exercise_2_Account_Lesson(1000.0);
        System.out.println(davidsAcc.getCount());
        Exercise_2_Account_Lesson savingsAccount = new Exercise_2_Account_Lesson();
        System.out.println(davidsAcc.getCount());
        System.out.println(savingsAccount.getCount());

        davidsAcc.setName("David");
        String name = davidsAcc.getName();

        davidsAcc.deposit(1000.0);
        savingsAccount.deposit(1500.0);

        System.out.println("Davids: " + davidsAcc.getBalance());
        System.out.println("Saving: " + savingsAccount.getBalance());


        double money = davidsAcc.withdraw(200);

        //savingsAccount.deposit(money);
        System.out.println("Du tog ut: " + money);

        System.out.println("Davids: " + davidsAcc.getBalance());
        System.out.println("Saving: " + savingsAccount.getBalance());*/

        /*Exercise_2_Account_Lesson davidsAcc = new Exercise_2_Account_Lesson(1000, "david");
        Exercise_2_Account_Lesson savingsAccount = new Exercise_2_Account_Lesson(0);
        Exercise_2_Account_Lesson saving2 = new Exercise_2_Account_Lesson(1500, "susan");
        Exercise_2_Account_Lesson saving3 = new Exercise_2_Account_Lesson(2500, "lois");
        Exercise_2_Account_Lesson saving4 = new Exercise_2_Account_Lesson(500, "laura");*/

        //savingsAccount.setName("Luna");
        ArrayList<Exercise_2_Account_Lesson> accounts = new ArrayList<>();

        /*accounts.add(davidsAcc);
        accounts.add(savingsAccount);
        accounts.add(saving2);
        accounts.add(saving3);
        accounts.add(saving4);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Skapa konton");
        String input = "";

        while (!input.equals("done")){
            System.out.println("Skriv namn på kontot");
            input = sc.nextLine();
            if(!input.equals("done")) {
                Exercise_2_Account_Lesson newAccount = new Exercise_2_Account_Lesson(0, input);
                accounts.add(newAccount);
            }
        }
        System.out.println(accounts.size());

        //String test = saving2.toString();

        //double money = saving2.withdraw(100);
        //saving4.deposit(money);

        for(Exercise_2_Account_Lesson account : accounts) {
            account.bankWithdrawal(19);
        }

        for(Exercise_2_Account_Lesson account : accounts){
            System.out.println(account);
            //System.out.println("name: " + account.getName() +
            //        " saldo: " + account.getBalance());
        }




    }
}