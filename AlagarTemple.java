public class AlagarTemple implements Temple {
    private String name;
    public AlagarTemple(){
        this.name="Alagar Kovil";
    }
    @Override
    public void description() {
        System.out.println("Alagarkoil (Alagar Temple) is a famous temple dedicated to Lord Vishnu\n" +
                " (Sundararaja Perumal), located about 21 km from Madurai at the foothills of the Alagar Hills.\n " +
                "The temple is known for its Dravidian architecture, sacred sculptures, and natural surroundings.\n" +
                " Lord Vishnu here is worshipped as Alagar (the handsome one). The temple is especially famous\n" +
                " during the Chithirai Festival, when Lord Alagar is believed to enter the Vaigai River to bless\n" +
                " devotees.");
    }

    @Override
    public void location() {
        System.out.println("It is located in Pudhur");

    }
}
