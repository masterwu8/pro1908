package com.acn;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class ArgsTest {

    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        System.out.println(namesList.size());
        namesList.add("Johnny");
        namesList.add("Johnny");
        namesList.add("Johnny");
        namesList.add("Johnny");
        namesList.add("Johnny");
        // System.out.println(namesList.size());
        namesList.add(1, "Mary");
        namesList.add(4, "Tom");
        // System.out.println(namesList);
        String[] names = namesList.toArray(new String[0]);
        Object[] objects = namesList.toArray();
        namesList.remove("Johnny");
        System.out.println(namesList);

        // Set<String> namesSet = new HashSet<>();
        Set<String> namesSet = new TreeSet<>();
        namesSet.add("Johnny");
        System.out.println(namesSet.add("Johnny"));
        System.out.println(namesSet.add("Johnny"));
        namesSet.add("Johnny");
        System.out.println(namesSet.size());
        namesSet.add("Carlo");
        System.out.println(namesSet.size());
        System.out.println("Johnny".hashCode());
        System.out.println(namesSet.contains("Johnny"));
        System.out.println(namesSet);
        // Date mydate = new Date();
        // java.sql.Date mydate2 = new java.sql.Date(22);
        // if (args.length > 1) {
        // // TODO Auto-generated method stub
        // System.out.println(sqrt(9) * PI);
        // System.out.println(args[1]);
        // }
        // List<String> nameList = Arrays.asList("Johnny", "Alice");
        // for (String name : nameList) {
        // System.out.println(name);
        // }
        // nameList.set(0, "Mary");
        // for (String name : nameList) {
        // System.out.println(name);
        // }
    }

}
