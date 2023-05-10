package turtleGame;

import static turtleGame.Direction.*;

public class Turtle {
    private boolean penIsDown;
    private Direction direction = EAST;
    private Position position = new Position(0, 0);
    public boolean isPenDown() {
        return penIsDown;
    }

    public void movePenDown() {
        penIsDown = true;

    }
    public void movePenUp() {
        penIsDown = false;
    }
    public Direction getDirection() {
        return direction;
    }
    public void turnRight() {

        if (direction == WEST) face(NORTH);
        if (direction == SOUTH) face(WEST);
        if (direction == EAST) face(SOUTH);
    }

    private void face(Direction newDirection) {
        direction = newDirection;
    }

    public void turnLeft() {
        if (direction == EAST) face(NORTH);
        else if (direction == NORTH) face(SOUTH);
        else if (direction == SOUTH) face(EAST);
        {

        }
    }

    public Position getPosition() {
        return position;
    }

    private void moveForward(int move) {
        if (direction == EAST) moveHorizontallyBY(move);
        if (direction == WEST) moveHorizontallyBY(move);
    }

    public void moveForward(int numberOfSteps, SketchPad sketchPad) {
        if (penIsDown) writeOn(sketchPad, numberOfSteps);
        moveForward(numberOfSteps);
    }

    private void writeOn(SketchPad sketchPad, int numberOfSteps) {
        var floor = sketchPad.getFloor();

        if (direction == EAST) {
        }
    }
        private void WriteEast(int numberOfSteps,int[][]floor){
        int currentColum =position.getColum();

            int row = position.getRow();
            for (int column = currentColum; column <= numberOfSteps+currentColum; column++) {
                floor[row][column] = 1;

            }

        }

    public void moveHorizontallyBY(int numberOfSteps){
            position.setColum(numberOfSteps+position.getColum());
        }

    }
