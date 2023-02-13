package surprise;

import java.util.ArrayList;

public class FifoBag implements IBag{
    public ArrayList<ISurprise> bagContent;

    public FifoBag(){
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
        /// aici trebuie sa ne asiguram ca scoatem intotdeauna prima pozitie din stiva
        ISurprise returnedSuprise=this.bagContent.get(0);
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
