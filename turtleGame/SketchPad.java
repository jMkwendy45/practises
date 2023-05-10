package turtleGame;

public class SketchPad {
    private  int[][]floor;
    public SketchPad(int floorRow, int floorColum) {
        floor = new  int[floorRow][floorColum];
    }
    public int[][]getFloor(){
        return  floor;
    }
    public  void display(){
        for (var row: floor){
            for (var colum :row){
                if (colum==1) System.out.println("* ");;
            }
        }
    }
}
