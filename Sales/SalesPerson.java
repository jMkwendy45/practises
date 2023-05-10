package Sales;

import java.security.SecureRandom;

public class SalesPerson {
    private int name;
    private int id;
    private int phoneNumber;


    public void setName(int name) {
        this.name = name;
    }

    public void setId() {
        SecureRandom secureRandom = new SecureRandom();
        int id = 2 + secureRandom.nextInt(4);
        System.out.println(id);

    }

    public int getId() {
        return id;
    }
    public void  setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public  int getPhoneNumber(){
        return phoneNumber;
    }
}

