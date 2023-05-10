package ChapterThree;

import ChapterThree.Car;

public class CarTest {
    public static void main(String[] args) {
        Car carOne = new Car();
        carOne.setModel("Camery");
        carOne.setYear(2003);
        Car carFour = new Car("honda",2023,8000);
        Car carTwo = new Car("Toyota", 2012, 4000);

        Car carThree = new Car("Honda", 2022);
        System.out.println("CarOne " + carOne.getModel() + "" + carOne.getYear());
        System.out.println("CarTwo " + carTwo.getModel() + carTwo.getYear());
        System.out.println("car Four"+carFour.getModel()+carFour.getPrice());
        carFour.applyDiscount(7);

    }
}
