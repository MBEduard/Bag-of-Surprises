package surprise;

public class BagFactory implements IBagFactory{
    @Override
    public IBag makeBag(String type) {
        IBag bag=null;
        switch (type) {
            case "RANDOM":
                bag=new RandomBag();
                break;
            case "FIFO":
                bag=new FifoBag();
                break;
            case "LIFO":
                bag=new LifoBag();
                break;
        }
        return bag;
    }
}
