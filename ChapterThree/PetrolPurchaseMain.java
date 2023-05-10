package ChapterThree;

public class PetrolPurchaseMain {
    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase("SaboYaba","Fuel",30,
                400.00,0.2);
        System.out.println(petrolPurchase.getLocation());
        System.out.println(petrolPurchase.getTypeOfPetrol());
        System.out.println(petrolPurchase.getQuantityOfPetrol());
        System.out.println(petrolPurchase.getPricePerLiter());
        System.out.println(petrolPurchase.getPurchase());
    }

}
