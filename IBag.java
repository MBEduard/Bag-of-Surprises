package surprise;



public interface IBag {
    void put(ISurprise newSurprise);
    void put(IBag bagOfSuprises);
    ISurprise takeOut();

    boolean isEmpty();
    int size();
}
