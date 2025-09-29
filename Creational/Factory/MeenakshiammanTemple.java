public class MeenakshiammanTemple implements Temple{
    private String name;
    public MeenakshiammanTemple(){
        this.name="Meenaksi Amman Tempple";
    }
    @Override
    public void description() {
        System.out.println("The Meenakshi Amman Temple,"+
                "Tamil Nadu, is one of the most famous and ancient temples in India.\n" +
                "Dedicated to Goddess Meenakshi (a form of Parvati) and Lord Sundareswarar (Shiva),\n" +
                "it is renowned for its Dravidian architecture, towering gopurams (gateway towers) covered \n" +
                "with thousands of colorful sculptures of gods, goddesses, and mythical figures.\n" +
                " The temple complex is spread over 14 acres, with 14 gopurams, sacred halls like the Ayiram Kaal\n" +
                " Mandapam (Hall of Thousand Pillars), and the sacred Golden Lotus Tank.\n " +
                "It is not only a major pilgrimage site but also a symbol of Tamil culture, history, and art.");
    }

    @Override
    public void location() {
        System.out.println("It is located in Madurai-Periyar(Bus stand)");
    }
}
