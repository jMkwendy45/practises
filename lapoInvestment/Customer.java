package lapoInvestment;

import java.math.BigDecimal;
import java.util.List;

public class Customer {
    private String name;
    private BigDecimal balance;
    private List<Transaction> transactionHistory;

    public Customer(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;

    }

    public String withdraw(double amount) throws TransactionException{
        if (balance.compareTo(BigDecimal.valueOf(amount)) < 1)
            throw new TransactionException("sapa big time");
        balance = balance.subtract(BigDecimal.valueOf(amount));
        return "Withdrawal sucessful";
    }



    public  String toString(){
        return  "Customer[\name:"+name+"\n"+"balance: "+balance;}

    }

