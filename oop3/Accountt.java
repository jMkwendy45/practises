package oop3;

public class Accountt {
    private int balance;

    public void Deposit(int amount){
        balance+=amount;
    }
    public  void withDraw(int amount){
        balance-=amount;
    }
    public int getBalance(){
        return  balance;
    }
}
