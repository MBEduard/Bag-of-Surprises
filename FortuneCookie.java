package surprise;


import java.util.Arrays;
import java.util.List;

import static helpers.Helper.getRandomNumber;

public class FortuneCookie implements ISurprise{

    static List<String> mesaje = Arrays.asList(
            "A aduce apă după ce s-a stins focul.",
            "A aduna nuiele pentru spinarea sa.",
            "A ajunge cuțitul la os.",
            "A auzit clopotul, dar nu știe de la ce bisericǎ.",
            "A avea ac de cojocul cuiva.",
            "A avea mai mult noroc decât minte.",
            "A bate apa-n piuă",
            "A bate calul care trage.",
            "A bate fierul cât e cald.",
            "A bate la ochi.",
            "A bate toba în tot satul.",
            "A călca pe bec.",
            "A cânta cuiva în strună.",
            "A căra apă cu ciurul.",
            "Aceași Mărie cu altă pălărie.",
            "Acela care Îl iubește pe Dumnezeu, îi iubește și pe oameni.",
            "A da bir cu fugiții.",
            "A da peste noroc.",
            "A da perle la porci.",
            "A despica firul în patru.",
            "A duce cu preșul.",
            "Adevărul este întotdeauna la mijloc.",
            "Adevărul se spune la despărțire.",
            "Adevărul stă scris printre rânduri.",
            "A dispărut de parcă l-a înghițit pământul.",
            "A face bortă în apă.",
            "A face cruce în tavan.",
            "A face cuiva hatârul.",
            "A face cum îl taie capul.",
            "A face din cal măgar și din țânțar armăsar.",
            "A face ochi dulci cuiva.",
            "A face pe cineva cu ou și cu oțet.",
            "A face pe cineva de două parale.",
            "A face treaba în doi peri.",
            "A face umbră pământului degeaba.",
            "A face un bine înseamnă a-și bate cuie în talpă.",
            "A fi cu ochii în patru.",
            "A fi pe drojdie (cu banii).",
            "A fi prins cu cioara vopsită.",
            "Ai ales pân-ai cules.",
            "Ai carte, ai parte.",
            "Ai, dai, n-ai. Ia nu da, să vezi cum ai.",
            "A dat-o cotită.");

    String mesajCurent;
    public FortuneCookie(String mesajNou){
        mesajCurent=mesajNou;
    }

    @Override
    public void enjoy() {
        System.out.println(mesajCurent);
    }

    public static FortuneCookie generate(){
        int pozitie= getRandomNumber(0,43);

        String mesaj= mesaje.get(pozitie);

        FortuneCookie newObject=new FortuneCookie(mesaj);

        return newObject;
    }
}
