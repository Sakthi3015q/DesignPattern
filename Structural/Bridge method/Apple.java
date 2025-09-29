public class Apple extends Fruits{


    public Apple(Identify identify) {
        super(identify);
    }

    @Override
    void display() {
      identify.checkFruit("Apple");
    }
}
