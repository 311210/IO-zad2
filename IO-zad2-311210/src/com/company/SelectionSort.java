package com.company;

public class SelectionSort implements SortStrategy {
    @Override
    public void sort(Object[] data) {
        int min, i, j, a, b;
        Object temp;

        for (i = 0; i < data.length - 1; i++) {
            min = i;
            for (j = i + 1; j < data.length; j++) {
                a = (int) data[j];
                b = (int) data[min];
                if (a < b) {
                    min = j;
                    temp = data[min];
                    data[min] = data[i];
                    data[i] = temp;
                }

            }


        }
    }
}
