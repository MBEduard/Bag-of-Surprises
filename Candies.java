package surprise;

import java.util.Arrays;
import java.util.List;

import static helpers.Helper.getRandomNumber;

public class Candies implements ISurprise {

    static List<String> listaDulciuri = Arrays.asList(
            "Ciocolata",
            "Kinder",
            "Milka",
            "Acadea",
            "Bomboane");

    private int _numar;
    private String _tip;
    public Candies(int numar, String tip){
        _numar=numar;
        _tip=tip;
    }

    @Override
    public void enjoy() {
        System.out.println("Ai mancat "+ _numar+" "+_tip);
    }

    public static Candies generate(){
        int pozitieDulciuri= getRandomNumber(0,5);
        int numarDulciuri= getRandomNumber(1,10);

        String tipDulce=listaDulciuri.get(pozitieDulciuri);

        Candies newObject=new Candies(numarDulciuri,tipDulce);

        return newObject;
    }
}
