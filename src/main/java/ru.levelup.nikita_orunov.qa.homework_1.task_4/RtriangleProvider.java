package ru.levelup.nikita_orunov.qa.homework_1.task_4;

/**
 * Created by nikitaorunov on 28.11.2017.
 */
public class RtriangleProvider {

    public static Rtriangle getRtriangle() {

        return new Rtriangle() {
            @Override
            public int getApexX1() {
                return 1;
            }

            @Override
            public int getApexY1() {
                return 0;
            }

            @Override
            public int getApexX2() {
                return 24;
            }

            @Override
            public int getApexY2() {
                return 0;
            }

            @Override
            public int getApexX3() {
                return 1;
            }

            @Override
            public int getApexY3() {
                return 24;
            }
        };
    }
}

