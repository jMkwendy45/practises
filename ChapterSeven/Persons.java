package ChapterSeven;

import java.util.List;

public class Persons  {
    private List<Problem>problems;

    public void add(Problem problem){
        problems.add(problem);
    }

    public  void tellProblem(){
        for (Problem problem:problems){
            if(problem.isSolved()) System.out.println(problem);
        }
    }
}
