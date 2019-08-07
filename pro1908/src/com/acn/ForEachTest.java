package com.acn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest {

    public ForEachTest() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // int[] numbers = { 1, 5, 8, 99, 33, 1 };
        // for(int i = 0; i < numbers.length; i++) {
        // System.out.println(i+1 + ": " + numbers[i]);
        // }
        // for (int number : numbers) {
        // System.out.println(number);
        // }

        List<Integer> numList = new ArrayList<Integer>();
        numList.add(1);
        numList.add(5);
        numList.add(8);
        numList.add(99);
        numList.add(33);
        numList.add(33);
        // for (Integer number : numList) {
        // // System.out.println(num);
        // int num = number;
        // if (num == 33) {
        // numList.remove(number);
        // }
        // System.out.println(number);
        // }
        // System.out.println(numList);
        // for (Iterator<Integer> iterator = numList.iterator(); iterator.hasNext();) {
        // Integer number = iterator.next();
        // if (number == 99) {
        // iterator.remove();
        // }
        // }
        // System.out.println(numList);
        // }

        int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };

        for (int[] onedimension : myComplexArray) {
            for (int num : onedimension) {
                System.out.print(num + ", ");
            }
            System.out.println();
        }
    }

}