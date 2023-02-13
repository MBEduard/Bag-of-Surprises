import surprise.*;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        BagFactory bagFactory=new BagFactory();

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!Please choose the bag type");
        String bagType=sc.next();
        IBag newBag = null;
        switch(bagType){
            case "RANDOM","Random","random":
                newBag=bagFactory.makeBag("RANDOM");
                break;
            case "FIFO","Fifo","fifo":
                newBag=bagFactory.makeBag("FIFO");
                break;
            case "LIFO","Lifo","lifo":
                newBag=bagFactory.makeBag("LIFO");
                break;
        }

        // Dupa ce avem acest bag trebuie sa generam cateva suprize si sa il bagam in el.
        // La fel am putea sa intrebam utilizatorul cate si ce tip
        System.out.println("Specificati numarul de surprize cu bomboane");
        int numarCandies=sc.nextInt();
        System.out.println("Specificati numarul de surprize cu prajituri cu ravas");
        int numarFortuneCookies=sc.nextInt();
        System.out.println("Specificati numarul de surprize cu Minioni");
        int numarMinion=sc.nextInt();

        for (int i = 0; i < numarCandies; i++) {
            ISurprise newSurprise=Candies.generate();
            assert newBag != null;
            newBag.put(newSurprise);
        }
        for (int i = 0; i < numarFortuneCookies; i++) {
            ISurprise newSurprise=FortuneCookie.generate();
            assert newBag != null;
            newBag.put(newSurprise);
        }
        for (int i = 0; i < numarMinion; i++) {
            ISurprise newSurprise=MinionToy.generate();
            assert newBag != null;
            newBag.put(newSurprise);
        }

        //De asemenea am putea sa cerem utilizatorului sa specifice cate suprize vrea sa elibereze
        //si in functie de asta sa apelam, random, una din cele 3 metode GiveSupriseAndxxxxx
        // Sau, efectiv il lasam pe el sa aleaga tipul de eliberare, si timpul de secunde de asteptare intre eliberari

        System.out.println("Precizati timpul de asteptare pentru eliberarea surprizelor");
        int waitTime = sc.nextInt();
        System.out.println("Precizati tipul de eliberare al surprizelor");
        String surpriseType=sc.next();

        switch(surpriseType){
            case"Sing","sing":
                GiveSurpriseAndSing give1 = new GiveSurpriseAndSing(bagType,waitTime);
                give1.setBag(newBag);
                give1.giveAll();
                break;
            case"Applause","applause":
                GiveSupriseAndApplause give2 = new GiveSupriseAndApplause(bagType,waitTime);
                give2.setBag(newBag);
                give2.giveAll();
            case"Hug","hug":
                GiveSupriseAndHug give3 = new GiveSupriseAndHug(bagType,waitTime);
                give3.setBag(newBag);
                give3.giveAll();
        }

    }

}
