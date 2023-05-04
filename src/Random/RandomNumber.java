package Random;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args){
        Random random = new Random();
        int number;
        for (int i = 1; i <=10 ; i++) {
            number = 1+random.nextInt(6);
            System.out.println(number + "");
        }
    }
}
