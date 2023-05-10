package tdd;

public class AirCondition {
private boolean isOn;
private int temperature;
private String productName;
    public boolean isOn() {
        return this.isOn;
    }
    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }


    public void increaseTemperature(int degree) {
        if(temperature >= 16 );
        temperature = temperature + degree;
        {
        }
         if (temperature>=30){
            temperature=degree;
        }

    }


    public void initalTemperature(int degree) {
        temperature = degree;
    }


    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature(int degree) {
        temperature = temperature -degree;

    }
}


