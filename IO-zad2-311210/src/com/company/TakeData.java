package com.company;

import java.io.*;
import java.util.*;

public class TakeData {

    static Object[] readFile(String path) {
        List<Integer> tall = new ArrayList<Integer>();
        try {
            Scanner scanner = new Scanner(new File(path));
            tall = new ArrayList<Integer>();
            while (scanner.hasNextInt()) {
                tall.add(scanner.nextInt());
            }

        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return tall.toArray();
    }
    static void writeFile(String path, Object[] arr){
        try {
            File myObj = new File("Output-"+path);
            myObj.createNewFile();
            FileWriter myWriter = new FileWriter("Output-"+path);
            for(int i=0;i< arr.length;i++) {
                myWriter.write(arr[i]+"\n");
            }
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
