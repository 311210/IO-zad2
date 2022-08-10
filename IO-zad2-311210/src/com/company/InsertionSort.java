package com.company;

public class InsertionSort implements SortStrategy{
    @Override
    public void sort(Object[] data) {
        int a, b;

        for (int i = 1; i < data.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                a = (int) data[j];
                b = (int) data[j + 1];
                if (a > b) {
                    Object temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                } else {
                    break;
                }
            }
        }

    }
}
