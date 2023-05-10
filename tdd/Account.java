package tdd;

  public class Account {
      private int balance;
      private int withdraw;

      public void deposit(int amount) {
          if (amount >=0) balance = amount + balance;
      }

      public int getBalance() {
          return balance;

      }
      public void withdraw(int amount) {
          if (amount > balance){
              System.out.println("Overdraft not allowed");
          }
         else if (amount>0){
              balance -= amount;
          }
      }

      public int balance() {
          return balance;
      }
      public void withdrawPin(int number) {
      }
  }