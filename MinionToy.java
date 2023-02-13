package surprise;

import java.util.Arrays;
import java.util.List;

public class MinionToy implements ISurprise{
    static List<String> listaMinioni = Arrays.asList(
            "Dave",
            "Carl",
            "Kevin",
            "Stuart",
            "Jerry",
            "Tim"
    );
    static int numarulUltimuluiMinionEliberat=0;
    private String _numeMinion;
    public MinionToy(String numeMinion){
        _numeMinion=numeMinion;
    }

    public static MinionToy generate(){
        /// ar trebui sa ne asiguram ca nu depasim numarul maxim de minioni

        String numeMinion = listaMinioni.get(numarulUltimuluiMinionEliberat);
        numarulUltimuluiMinionEliberat++;

        MinionToy newObject=new MinionToy(numeMinion);

        return newObject;
    }

    @Override
    public void enjoy() {
        System.out.println("Te joci cu "+ _numeMinion);
    }
}
