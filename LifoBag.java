package surprise;

import java.util.ArrayList;

public class LifoBag implements IBag{
    public ArrayList<ISurprise> bagContent;
    public LifoBag(){
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
        /// Scoatem pe rand cate o supriza din bagOfSuprises pana nu mai avem nimic
        /// Fiecare supriza scoasa o adaugam in lista noastra
        while (!bagOfSuprises.isEmpty()){
            ISurprise newSuprise=bagOfSuprises.takeOut();
            this.bagContent.add(newSuprise);
        }
    }

    @Override
    public ISurprise takeOut() {
        /// aici trebuie sa ne asiguram ca scoatem intotdeauna ultima pozitie din stiva
        ISurprise returnedSuprise=this.bagContent.get(bagContent.size()-1);
        this.bagContent.remove(returnedSuprise);
        return returnedSuprise;
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
