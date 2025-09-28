public class TempleFactory {

    public static Temple getTemple(int choice){
        switch (choice){
            case 1:return new MeenakshiammanTemple();
            case 2:return new MuruganTemple();
            case 3:return new AlagarTemple();
            case 4:return new PandiTemple();

        }
        return null;
    }

}
