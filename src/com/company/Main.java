package com.company;

import sun.nio.cs.ArrayDecoder;

import java.awt.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = new int[20];
        for (int i = 0; i<20; i++)
            numbers[i] = i*2;
        int value = Arrays.binarySearch(numbers, 24);
        int ar[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};
        Arrays.fill(ar, 10);
        System.out.println("Array completely filled" +
                " with 10\n" + Arrays.toString(ar));
        System.out.println(value);

        Arrays.fill(ar, 1, 6, 20);
        System.out.println("Array partially filled" +
                " with 10\n" + Arrays.toString(ar));

        Rectangle[] rectList = new Rectangle[10];
        // How many Rectangle objects exist?

        //rectList[5].setSize(5,10);
        //uh oh!
        if(ar==numbers)
            System.out.println("Both are equal");
        else{
            System.out.println("Both are not equal");
//            if(ar>numbers)
//                System.out.println("This is me being stupid");
//            else
//                System.out.println("This is me being stupid");
        }
        System.arraycopy(numbers,4,ar,2, 5);
        System.out.println("Here are your copied elements\n" + Arrays.toString(ar));
        for(int i = 0; i < rectList.length; i++)
        {	rectList[i] = new Rectangle();
        }

        rectList[3].setSize(100,200);

        int[][] mat = new int[3][4];

        /*
        0: [0,1,2,3]
        1: [0,1,2,3]
        2: [0,1,2,3]
        * */

        int[][] raggedMat = new int[5][];
        for(int i = 0; i < raggedMat.length; i++)
            raggedMat[i] = new int[i + 1];
        System.out.println(Arrays.toString(raggedMat));

        Object[] items = new Object[10];
        items[0]=2;             //45 = 2
        items[1]="Pradeep";
        System.out.println(items);
    }
}
