package PersonalPractise;

public class Iphone {
private static String colour;
private  final static double price = 699.9;


public  void setColour(String colour){
    Iphone.colour = colour;

}
public static String getColour(){
    return colour;
}

  public  static  double getPrice() {
        return price;
    }
}
