public class MuruganTemple implements Temple {
   private String name;
   public MuruganTemple(){
       this.name="Murugar Kovil";
   }
    @Override
    public void description() {
        System.out.println("The Pudhalpadai Veedu Murugan Temple is a well-known shrine dedicated to Lord Murugan,\n" +
                " located near Madurai in Tamil Nadu. The temple is famous for its unique style, serene\n " +
                "surroundings, and spiritual significance among Murugan devotees. \n" +
                "It is believed that worshipping here brings strength, courage, and blessings for family prosperity.\n" +
                " The temple attracts devotees especially during Kanda Sashti and other Murugan festivals.");
    }

    @Override
    public void location() {
       System.out.println("It is located in Thiruparankundram");

    }
}
