public class PandiTemple implements Temple{
    private String name;
    public PandiTemple(){
        this.name="Pandi Kovil";
    }
    @Override
    public void description() {
        System.out.println("The Pandi Kovil (Sri Pandi Muneeswarar Temple) in Madurai, is dedicated to Pandi\n " +
                "Muneeswarar, believed to be the spirit of the Pandya king Nedunchezhiyan seeking penance for\n" +
                "the injustice done to Kovalan in the Tamil epic Silappatikaram. According to legend, the idol\n" +
                " of the deity was found buried underground after a divine vision to a couple, who later\n" +
                "established the temple. Today, Pandi Muneeswarar is worshipped as a guardian deity\n " +
                "(Kaaval Deivam), and the temple also houses sub-shrines for deities like Samaya Karuppasamy.\n " +
                "It is a popular place of faith in Madurai, where devotees seek protection, justice, and blessings.");
    }

    @Override
    public void location() {
        System.out.println("It is located in Melamadai");

    }
}
