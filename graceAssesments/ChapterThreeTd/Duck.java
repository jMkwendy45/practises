package graceAssesments.ChapterThreeTd;

public class Duck {
    private Flyable myFlyable;
    private Quackable myQuack;

    public Flyable getMyFlyable() {
        return myFlyable;
    }

    public void setMyFlyable(Flyable myFlyable) {
        this.myFlyable = myFlyable;
    }

    public Quackable getMyQuack() {
        return myQuack;
    }

    public void setMyQuack(Quackable myQuack) {
        this.myQuack = myQuack;
    }

    public Duck(Flyable myFlyable, Quackable myQuack) {
        this.myFlyable = myFlyable;
        this.myQuack = myQuack;
    }
   public  void fly(){
        myFlyable.fly();
   }
   public void quack(){
        myQuack.quack();
   }
}
