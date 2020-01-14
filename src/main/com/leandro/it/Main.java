package com.leandro.it;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] array;
        array = new int[5];
        double resultado = 0;
        double acumulador = 0;

        array[0] = 1;
        array[1] = 1;
        array[2] = 0;
        array[3] = -1;
        array[4] = -1;

        double result = IntStream
                .range(0, array.length)
                .filter(i -> array[i] > 0)
                .mapToDouble(i -> array[i])
                .sum() / array.length;
        System.out.println(result);

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {
                acumulador = acumulador + array.length;
                System.out.println(acumulador);
            }
        }
    }
}
