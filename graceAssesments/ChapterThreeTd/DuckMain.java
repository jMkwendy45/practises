package graceAssesments.ChapterThreeTd;

public class DuckMain {
    public static void main(String[] args) {
        FlyZero flyZero = new FlyZero();
        QuackOne quackOne = new QuackOne();
        Duck myduck = new Duck(flyZero,quackOne);
        myduck.fly();
        myduck.fly();

    }
}
