package com.company;

public class BubbleSort implements SortStrategy{
    @Override
    public void sort(Object[] data) {
        int a,b;
        for(int i = 0; i < data.length - 1; i++) {
            for(int j = 0; j < data.length - 1; j++) {
                a=(int)data[j];
                b=(int)data[j + 1];
                if(a>b) {
                    Object temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }

    }


}
