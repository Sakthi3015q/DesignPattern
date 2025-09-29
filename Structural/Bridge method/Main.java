//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Apple apple1=new Apple(new Rotten());
       apple1.display();

       Apple apple2=new Apple(new UnRotten());
       apple2.display();

       Orange orange1=new Orange(new UnRotten());
       orange1.display();

       Orange orange2=new Orange(new Rotten());
       orange2.display();

    }
}