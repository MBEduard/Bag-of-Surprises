package surprise;

import java.util.ArrayList;

import static helpers.Helper.getRandomNumber;

public final class GatherSuprises {
    private GatherSuprises(){

    }

    public static ArrayList<ISurprise> gather(int n){
        ArrayList<ISurprise> supriseList=new ArrayList<ISurprise>();
        for (int i = 0; i < n; i++) {
            ISurprise surprise=null;

            surprise=generateRandomSurprise();

            supriseList.add(surprise);
        }

        return supriseList;
    }

    public static ISurprise gather(){
        ISurprise surprise= generateRandomSurprise();
        return surprise;
    }

    private static ISurprise generateRandomSurprise(){
        ISurprise surprise=null;

        // generam random un numar de la 1 la 3, pentru fiecare tip de supriza
        int tipSurpriza= getRandomNumber(1,3);

        switch (tipSurpriza) {
            case 1:
                surprise=FortuneCookie.generate();
                break;
            case 2:
                surprise=Candies.generate();
                break;
            case 3:
                surprise=MinionToy.generate();
                break;
        }
        return surprise;
    }
}
