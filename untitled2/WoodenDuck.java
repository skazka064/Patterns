public class WoodenDuck extends  Duck {

    public WoodenDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();

    }

    @Override
    public void display() {
        System.out.println("I'm hello tree!");
    }
}

