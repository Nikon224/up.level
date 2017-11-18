/**
 * Created by nikitaorunov on 18.11.17.
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] num = { 3,6,1,7,2,8,10,4,9,5};
        int n = num.length;

        bubbleSort(num);


        for (int h = 0; h < n; h++)
            System.out.print(num[h]+ " ");
    }

    public static void bubbleSort(int[] numbers) {

        int n = numbers.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (numbers[j - 1] > numbers[j]) {
                    //swap elements
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                    System.out.println(temp);
                    //System.out.println(numbers);
                }
            }
        }
    }
}
