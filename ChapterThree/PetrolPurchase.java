package ChapterThree;

public class PetrolPurchase {

    private String location;
    private String typeOfPetrol;
    private int quantityOfPetrol;
    private double pricePerLiter;
    private double PercentageDiscount;

    public double getPercentageDiscount() {
        return PercentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        PercentageDiscount = percentageDiscount;
    }




    public PetrolPurchase(String location,String typeofPetrol,int quantityPetrol
            ,double pricePerLiter,double percentageDiscount){
        this.location=location;
        this.typeOfPetrol=typeofPetrol;
        this.quantityOfPetrol =quantityPetrol;
        this.pricePerLiter=pricePerLiter;
        this.PercentageDiscount=percentageDiscount;
    }
    public void setLocation(String name) {
        this.location = name;
    }
    public String getLocation() {
        return location;
    }

    public void setTypeOfPetrol(String petrol) {
        this.typeOfPetrol = petrol;
    }
    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setQuantityOfPetrol(int number){
        this.quantityOfPetrol =number;
    }
    public int getQuantityOfPetrol() {
        return quantityOfPetrol;}

    public double getPurchase(){
        double netPurchase;
        netPurchase = quantityOfPetrol *pricePerLiter-PercentageDiscount;
        return netPurchase;
    }
    public double getPricePerLiter() {
        return pricePerLiter;
    }
    public void setPricePerLiter(double number) {
        this.pricePerLiter = number;
    }


   }


