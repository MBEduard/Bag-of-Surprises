package surprise;

public class GiveSupriseAndHug extends AbstractGiveSuprises{
    public GiveSupriseAndHug(String bagType, int waitTime) {
        super(bagType, waitTime);
    }

    @Override
    public void giveWithPassion() {
        System.out.println("Warm wishes and a big hug!");
    }
}
