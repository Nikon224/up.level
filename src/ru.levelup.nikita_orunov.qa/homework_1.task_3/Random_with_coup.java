/**
 * Created by nikitaorunov on 18.11.17.
 */
import java.util.Random;

public class Random_with_coup {
    public static void main(String[] args) {


        int[] mass = new int[10];
        Random rand = new Random();
        for ( int i = 0; i < mass.length; i++ ) {
            mass[i] = rand.nextInt(10)-3;
            System.out.println("mass(1)["+i+"]="+ mass[i]);

        System.out.println(mass);


        for (int k = 0; k < mass.length; --k) {
            //int temp = mass[k];
           // mass[k] = mass[k - mass.length - k - 1];
            System.out.println("mass(2)[" + k + "]=" + mass[k]);
            //mass[k - mass.length - k - 1] = temp;
        }

        }


    }

}




//
//        int[] array;
//        array = new int[12];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = ((int)(Math.random() * (100+1)) - 15);
//            System.out.print(array[i]+" ");
//
//
//        }
//
//            //int mac[i] = (int) ( Math.random() * (100+1))-10;
//           // int n = rand.nextInt(10)-100;
//           // System.out.println(mac);
//        }
//    }
//
//
//    int mav[ ] = new mav [12];

//
//        int h = (int) ( Math.random() * (100+1))-1000;
//
//        System.out.println(a);







