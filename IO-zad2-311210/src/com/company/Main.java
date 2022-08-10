package com.company;

public class Main {

    public static void main(String[] args) {

    SortStrategy test=new InsertionSort();

    String path="plik.txt";
	Object[] arr;

    arr= TakeData.readFile(path);
    test.sort(arr);
    TakeData.writeFile(path,arr);

    }
}
