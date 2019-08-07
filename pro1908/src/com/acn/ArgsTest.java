package com.acn;

import java.sql.*;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class ArgsTest {

    public static void main(String[] args) {
        // Date mydate = new Date();
        // java.sql.Date mydate2 = new java.sql.Date(22);
        // if (args.length > 1) {
        // // TODO Auto-generated method stub
        // System.out.println(sqrt(9) * PI);
        // System.out.println(args[1]);
        // }
        List<String> nameList = Arrays.asList("Johnny", "Alice");
        for (String name : nameList) {
            System.out.println(name);
        }
        nameList.set(0, "Mary");
        for (String name : nameList) {
            System.out.println(name);
        }
    }

}
