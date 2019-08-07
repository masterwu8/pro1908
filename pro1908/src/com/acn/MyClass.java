package com.acn;

public class MyClass {
    int number = 0XF;
    long num3 = 1000_000_000_000L;
    double num4 = 33.;
    float num5 = 1.f;
    static char mychar = 65;
    static short var1 = 2;
    static short var2 = 6;
    static short var3 = (short) (var1 + var2);
    static long number2 = Integer.MAX_VALUE + 1L;
    static float number3 = 12345678901234f;
    boolean isTrue;
    
    public MyClass() {
        
    }

    public static void main(String[] baba) {
        System.out.println((char) (mychar + 2));
        // TODO Auto-generated method stub
        int number = 0;
        MyClass myclass = new MyClass();
        System.out.println(number+ " " +number3+ " " + myclass.isTrue);

    }

}