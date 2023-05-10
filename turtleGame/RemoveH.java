package turtleGame;

public class RemoveH {
    public static void main(String[] args) {
        String input = "a,b,c,#,#,x,y,#";
        String[] array = input.split("#");

        StringBuilder output = new StringBuilder();
        boolean foundHash = false;
        for (String s : array) {
            if (s.equals(",")) {
                output.append(s);
                foundHash = true;
            } else if (foundHash) {
                output.append(s);
            }
        }

        System.out.println(output);
    }
}

