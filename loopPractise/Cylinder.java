package loopPractise;

public class Cylinder {

    private int radius =1;

    private int height = 1;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public static void calculateCylinderVolume(int radius, int height){
    double pie = 3.1427;
    double volume = pie*radius*radius*height;
}
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
    if (height>0)
        this.height = height;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        if (radius>0)
            this.radius = radius;
    }

















}
