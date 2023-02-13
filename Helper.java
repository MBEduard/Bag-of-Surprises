package helpers;

import java.util.Random;

public class Helper {
    public static int getRandomNumber(int low, int high){
        Random random=new Random();

        int randomNumber=random.nextInt(high-low) + low;

        return randomNumber;
    }
}
