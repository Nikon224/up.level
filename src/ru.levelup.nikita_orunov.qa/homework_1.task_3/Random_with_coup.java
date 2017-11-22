/**
 * Created by nikitaorunov on 18.11.17.
 */
import java.util.Random;
import  java.util.Arrays;
import java.util.Scanner;


public class Random_with_coup {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Введите количество элементов массива: ");
//        int num = input.nextInt();


        int[] numbers = new int[22];

        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (rand.nextInt(30));
            System.out.println(numbers[i]);
        }

        reverse(numbers);
    }

    /**
     * reverse the given array in place * @param input
     */
    public static void reverse(int[] input) {
        System.out.println("original array : " + Arrays.toString(input));

        if (input == null || input.length <= 1) {
            return;
        }
        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            //  numbers
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
        System.out.println("reversed array : " + Arrays.toString(input));
    }
}


