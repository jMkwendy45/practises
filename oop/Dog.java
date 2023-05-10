package oop;

public class Dog extends Animal{
    private  String tall;



    public void bite(){
        System.out.println("Make noise and i bite you !!!!!!!!!");
    }

    @Override
    public String makeSound() {
        return "bark bark bark!!!!!!";
    }
}
