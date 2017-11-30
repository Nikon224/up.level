package ru.levelup.nikita_orunov.qa.homework_1.task_4; /**
 * Created by nikitaorunov on 28.11.2017.
 */

import java.util.*;

import org.junit.Test;

import static org.junit.Assert.*;


public class RtriangleTest {

    public Rtriangle triangle = RtriangleProvider.getRtriangle();


    @Test
    public void testTriangleShouldBeRectangular() {

        // Считаем квадраты сторон
        int a2 = (int) Math.pow((triangle.getApexX2() - triangle.getApexX1()), 2) + (int) Math.pow((triangle.getApexY2() - triangle.getApexY1()), 2);
        int c2 = (int) Math.pow((triangle.getApexX3() - triangle.getApexX1()), 2) + (int) Math.pow((triangle.getApexY3() - triangle.getApexY1()), 2);
        int b2 = (int) Math.pow((triangle.getApexX3() - triangle.getApexX2()), 2) + (int) Math.pow((triangle.getApexY3() - triangle.getApexY2()), 2);

        // Выбираем наибольшую сторону, которая должна быть гипотенузой
        int[] list = new int[3];
        list[0] = a2;
        list[1] = b2;
        list[2] = c2;

        System.out.println(" сторона \"A\" = "+a2+ " сторона \"B\"= "+b2+" сторона \"C\" = "+c2);

        Arrays.sort(list);

        // Считаем сумму квадратов катетов
        int sumSquaresCathetus = list[0] + list[1];
        int squareHypotenuse = list[2];

        if (squareHypotenuse == sumSquaresCathetus) {
            System.out.println(" Я сделал это, честно списал и разобрался ");
        }else {
            System.out.println("Жизнь боль");
        }


        // Сравниваем сумму квадратов катетов и гипотенузы
        assertEquals("Сумма квадратов катетов должна равняться квадрату гипотенузы", sumSquaresCathetus, squareHypotenuse);

    }
}
