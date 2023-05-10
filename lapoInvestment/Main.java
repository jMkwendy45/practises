package lapoInvestment;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("sherriff",new BigDecimal(40));
        try {
            String message = customer.withdraw(50);
            System.out.println(message);
            System.out.println(customer);
        }
        catch (TransactionException ex){
            System.out.println("ERROR"+ex.getMessage());
        }
        finally {
            System.out.println(customer);
            System.out.println("Thanks for banking with us");
        }
    }
}
