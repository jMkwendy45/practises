package ChapterFour;

public class SalesCommission {
private double amount;
private double salary;


public void setSalary(double salary){
    this.salary=salary;
}
public double getSalary(){
    return salary;
}

public void setAmount(double amount){
    this.amount = amount;
 }
public double getAmount(){
    return amount;
}
public double getTotalEarning(){
    double totalEarning;
    double percentage;
    percentage = 9/getAmount()*100;
    totalEarning = percentage+getSalary();

    return totalEarning;
}

}
