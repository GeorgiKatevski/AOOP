package com.company;

public class Main {
    public static void hDistance(int a, int b){
        int code = a ^ b;
        int result = 0;

        while (code != 0)
        {
            if ((code & 1) == 1)
            {
                result++;}
            code >>= 1;
        }

        String firstNumber=String.format("%8s",Integer.toBinaryString(a));
        firstNumber = firstNumber.replace(' ','0');
        System.out.println(firstNumber);

        String secondNumber=String.format("%8s",Integer.toBinaryString(b));
        secondNumber = secondNumber.replace(' ','0');
        System.out.println(secondNumber);

        System.out.println(result);
    }

    public static void main(String[] args) {
        hDistance(1, 3);
        //possible solution: void hDistance(byte a, byte b)
        // because 1 byte == 8 bits

    }
}