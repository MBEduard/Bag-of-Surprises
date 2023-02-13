package surprise;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSuprises {
    private IBag bag;
    private int waitTime;

    private String bagType;

    public IBag getBag() {
        return bag;
    }

    public void setBag(IBag bag) {
        this.bag = bag;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public AbstractGiveSuprises(String bagType, int waitTime){
        this.waitTime=waitTime;
        this.bagType=String.valueOf(bag);
    }

    public void put(ISurprise newSurprise){
        bag.put(newSurprise);
    }

    public void put(IBag destinationSupriseBag){
        bag.put(destinationSupriseBag);
    }

    public void give(){
        ISurprise surprise=bag.takeOut();

        surprise.enjoy();
        giveWithPassion();
    }

    public void giveAll(){
        while (!bag.isEmpty())
        {
            try {
                TimeUnit.SECONDS.sleep(waitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            give();
        }
        giveWithPassion();
    }
    public boolean isEmpty(){
        return bag.isEmpty();
    }

    public abstract void giveWithPassion();
}
