package ChapterThree;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Jane Green", 1000.00);
        Account account2 = new Account("Oluchi Mercy", 500.00);



        System.out.println("Account name is"+account1.getName());
        System.out.println("your initial deposit "+account1.getBalance());
        System.out.println("Enter your deposit for first account");
        double depositAmount = input.nextDouble();
        System.out.println("amount deposited is"+depositAmount);
        account1.deposit(depositAmount);
        System.out.println("Your balance balance is"+account1.getBalance());




        System.out.println("Second Account name is"+account2.getName());
        System.out.println("Enter your deposit Second account");
        double depositAmount2 = input.nextDouble();
        System.out.println("amount deposited is"+depositAmount2);
        account2.deposit(depositAmount2);
        System.out.println("your balance is "+account2.getBalance());

    }

}