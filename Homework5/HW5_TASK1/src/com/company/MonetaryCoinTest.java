package com.company;

import java.util.Random;

public class MonetaryCoinTest {

    public static void main(String[] args)
    {
        Coin coin=new Coin();
        coin.flip();
        coin.print();
        System.out.println(coin.isHeads());
        MonetaryCoin coin2=new MonetaryCoin();
        coin2.flip();
        coin2.print2();

    }





}
