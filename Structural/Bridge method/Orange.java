public class Orange extends Fruits{
    public Orange(Identify identify){
        super(identify);
    }
    @Override
    void display() {
        identify.checkFruit("Orange");
    }
}
