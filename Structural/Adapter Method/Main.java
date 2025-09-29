//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sparrow sparrow=new Sparrow();
        PlasticToyDuck toy=new PlasticToyDuck();

        System.out.println("This is sparrow ");
        sparrow.fly();;
        sparrow.makeSound();
        System.out.println();

        System.out.println("This is ToyDuck");
        toy.squeak();
        System.out.println();

        BirdAdapter birdAdapter=new BirdAdapter(sparrow);
        System.out.println("This is Adapted Bird");
        birdAdapter.squeak();

    }
}