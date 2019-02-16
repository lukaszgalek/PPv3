package SDA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        Random generator = new Random();
        List parzyste = new ArrayList();
        List nieparzyste = new ArrayList();


        for (int i = 0; i < 20; i++) {

            int value = generator.nextInt(10) + 1;
            if (value % 2 == 0) {
                if (parzyste.size() < 10) {
                    parzyste.add(value);

                }else {--i;}

            } else {
                if (nieparzyste.size() < 10) {
                    nieparzyste.add(value);

                }else { --i;}


                }
            }

        System.out.println(parzyste);
        System.out.println(nieparzyste);


    }
}
