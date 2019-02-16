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
        List<Integer> parzyste = new ArrayList();
        List<Integer> nieparzyste = new ArrayList();


        for (int i = 0; i < 20; i++) {

            int value = generator.nextInt(10) + 1;// pierwszy nawias informuje do jakiej wartości losuje, + wartość mówi od jakiej wartości losuje
            if (value % 2 == 0) {
                if (parzyste.size() < 10) {
                    parzyste.add(value);

                } else {
                    --i;
                }

            } else {
                if (nieparzyste.size() < 10) {
                    nieparzyste.add(value);

                } else {
                    --i;
                }


            }
        }
// drugi sposób na pętli while
        //while (parzysta.size() < 10 || nieparzyste.size() <10){
        // int randomValue = random.nextInt ( 100);
//        if(randomValue%2==0&& parzyste.size()<10){
//            parzyste.add(randomValue);}
//       if(randomValue%2!=0&& nieparzyste.size()<10) {
//       nieparzyste.add(randomValue);}
//        }

//        System.out.println(parzyste);
//        System.out.println(nieparzyste);
        int temp = 0;

//        for (int i = 0; i <= parzyste.size() - 1; i++)
//            for (int j = i; j <= parzyste.size() - 1 - i; j++){
//                if (parzyste.get(i) > parzyste.get(j + 1)) {
//                    temp = parzyste.get(j + 1);
//
//
//                }
//    }
//        System.out.println(parzyste);




//        System.out.println(parzyste);
//
//        int[] tabParzyste = new int[parzyste.size()];
//        for (int i = 0; i <= parzyste.size() - 1; i++) {
//            tabParzyste[i] = parzyste.get(i);
//        }
//
//        int max = 0;
//        int indexMin=0;
//        for (int i = 0; i <= tabParzyste.length - 1; i++) {
//            for (int j = i; j <= tabParzyste.length - 1 ; j++) {
//                if (tabParzyste[i] > tabParzyste[j]) {
//                    temp = tabParzyste[j];
//                    max = tabParzyste[i];
//                    indexMin = j ;
//
//                }
//            }
//            tabParzyste[i] = temp;
//            tabParzyste[indexMin] = max;
//        }
//
//        for ( int i = 0 ; i<= tabParzyste.length-1; i++){
//            System.out.print(tabParzyste[i]+", ");
//        }
        System.out.println(parzyste);
        Integer[] sortedEven = sort(parzyste);
        for ( int i = 0 ; i<= sortedEven.length-1 ; i++){
            System.out.print(sortedEven[i] + " , ");
        }

        }
public static Integer[] sort(List<Integer>list) {
    Integer[] values = new Integer[list.size()];
    list.toArray(values);
    for (int i = 0; i <= values.length - 1; i++) {
        int min = values[i];
        int minIndex = i;
        for (int j = i; j <= values.length - 1; j++) {
            if (values[j] <= min) {
                min = values[j];
                minIndex = j;
            }
        }
        int temp = values[i];
        values[i] = min;
        values[minIndex] = temp;

    }
    return values;
}
    }
