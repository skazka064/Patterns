public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard= new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();


        Duck wooden = new WoodenDuck();
        wooden.display();
        wooden.performFly();

    }
}
