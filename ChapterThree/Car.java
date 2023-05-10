package ChapterThree;

import java.time.Year;

public class Car {

    private String model;
    private int year;
    private double price;
    public Car( ) {
   }

   public Car(String model, int year, double price){
       this.model = model;
       this.year = year;
       this.price = price;
   }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void setModel(String name){
        this.model=name;
    }
    public String getModel(){
        return model;
    }

     public void setYear(int number) {
         this.year=number;
     }

    public int getYear(){
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
    public void applyDiscount(double discount){
        price = price*(1- discount/100);
    }























}

