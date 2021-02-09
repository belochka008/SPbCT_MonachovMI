package com.company;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        printArray(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        printArray(new Integer[]{1, 2, 3, 4, 5, 6});
        printArray(new Integer[]{1});
    }
    public static void printArray(Object[] elements) {
        if (elements == null || elements.length == 0) {
            return;
        }
        System.out.print(Arrays.toString(elements) + ": ");
        int i = 1;
        while (i <= elements.length - 1) {
            System.out.print(elements[i] + " ");
            i = i + 2;
        }
        System.out.print(", ");
        i = 0;
        while (i <= elements.length - 1) {
            System.out.print(elements[i] + " ");
            i = i + 2;
        }
        System.out.println();
    }

}
