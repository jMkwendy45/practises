package turtleGame;

public class Position {
    private int row;
    private int  colum;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColum() {
        return colum;
    }

    public void setColum(int colum) {
        this.colum = colum;
    }

    public Position(int row, int colum) {
        this.row = row;
        this.colum = colum;
    }

    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", colum=" + colum +
                '}';
    }
    @Override
    public boolean equals(Object anotherObject){
        if (anotherObject.getClass() != Position.class)return false;
        Position o =(Position) anotherObject;
        if (this.row==o.row && this.colum==o.colum)
                 return  true;
      return false;
    }
}
