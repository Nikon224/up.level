/**
 * Created by nikitaorunov on 18.11.17.
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int num = input.nextInt();

        // Создаем массив введенного пользователем размера
        int array[];
        array = new int[num];

        System.out.println("Массив = " + num + "");

        //Заполняем массив, вводя элементы в консоль
        Random rand = new Random();
       // for (counter = 0; counter < num; counter++)
        for (int i = 0; i < num; i++) {
            array[i] = (rand.nextInt(30));
            System.out.println(  array[i]);
        }


        // сортируем элементы массива, так как для бинарного поиска
        // элементы массива должны быть отсортированными
        Arrays.sort(array);

        for (int i = 0; i < num; i++) {
            System.out.println(i + ": " + array[i]);
        }

        System.out.println("Введите элемент для бинарного поиска: ");
        int item = input.nextInt();
        int first = 0;
        int last = num - 1;

        // метод принимает начальный и последний индекс, а также число для поиска
        binarySearch(array, first, last, item);
    }

    // бинарный поиск
    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int comparisonCount = 1;    // для подсчета количества сравнений

        // для начала найдем индекс среднего элемента массива
        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            if (array[position] > item) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " является " + ++position + " элементом в массиве");
            System.out.println("Метод бинарного поиска нашел число после " + comparisonCount +
                    " сравнений");
        } else {
            System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после "
                    + comparisonCount + " сравнений");
        }
    }

}

