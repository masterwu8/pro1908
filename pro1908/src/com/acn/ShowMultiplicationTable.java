package com.acn;

import java.util.Scanner;

public class ShowMultiplicationTable {

    public ShowMultiplicationTable() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dimension: ");
        int number = scan.nextInt();
        for(int i=1; i<=number; i++) {
            for(int j=1; j<=number; j++) {
                System.out.printf("%3d ", i*j);
            }
            System.out.println();
        }

    }

}