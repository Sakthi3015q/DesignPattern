public class TV implements Device{
    @Override
    public void turnOn() {
         System.out.println("TV is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is now OFF");

    }
    public void changeChannel(){
        System.out.println("TV channel is channged");
    }
}
