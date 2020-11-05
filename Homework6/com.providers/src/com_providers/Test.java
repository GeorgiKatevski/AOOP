package com_providers;

import com_services.Cipherable;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Wrapper wrapper=new Wrapper(20);
        CipherGenerator c1;
        Result result=CipherGenerator.countDistinct(wrapper.makeFixedRandom(),3);
        System.out.println(result.getChars());
        System.out.println(result.getData());

        CipherGenerator c;
        Result result2=CipherGenerator.countDistinct(wrapper.makeFixedSelection(),4);
        System.out.println(result2.getChars());
        System.out.println(result2.getData());
    }
}
