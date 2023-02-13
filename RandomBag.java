package surprise;
import static helpers.Helper.getRandomNumber;
import java.util.ArrayList;

public class RandomBag implements IBag{

    public ArrayList<ISurprise> bagContent;
    public RandomBag(){
        this.bagContent=new ArrayList<>();
    }

    @Override
    public void put(ISurprise newSurprise) {
        this.bagContent.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSuprises) {
        /// Eliminam toate suprizele care le avem in bagContent
        this.bagContent.clear();
        /// Scoatem pe rand cate o suprisa din bagOfSuprisez pana nu mai avem nimic
        /// Fiecare supriza scoasa o adaugam in lista noastra
        while (!bagOfSuprises.isEmpty()){
            ISurprise newSuprise=bagOfSuprises.takeOut();
            this.bagContent.add(newSuprise);
        }
    }

    @Override
    public ISurprise takeOut() {

        /// Aici trebuie sa luam un numar random , de la 0 la numarum maxim disponibil
        if(!bagContent.isEmpty()) {
            int randomizer = getRandomNumber(0, bagContent.size());
            ISurprise returnedSuprise = this.bagContent.get(randomizer);
            this.bagContent.remove(returnedSuprise);
            return returnedSuprise;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty=false;
        if(this.bagContent.size()==0)
            isEmpty=true;

        return isEmpty;
    }

    @Override
    public int size() {
        return this.bagContent.size();
    }
}
