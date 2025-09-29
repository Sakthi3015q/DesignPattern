import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("1.MeenakshiAmman Temple\n2.Murugar Temple\n3.Alagar Temple\n4.Pandi Temple\n5.Exit");
            System.out.print("Enter choice:");
            int choice = sc.nextInt();
            if(choice==5)return ;
            Temple temple=TempleFactory.getTemple(choice);
            temple.description();
            System.out.println();
            temple.location();
        }


    }
}