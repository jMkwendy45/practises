package tdd;

public class Baby {

    private int age;
    private int weightInKg;
    private String name;

    public Baby(int babyWeightAtBirth) {
        weightInKg = babyWeightAtBirth;
    }

    public Baby(){
    }

    public Baby(String babyNameAtBirth,int babyWeight){
        name= babyNameAtBirth;
        weightInKg= babyWeight;
    }



    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getWeightInKg() {
        return weightInKg;

    }













}