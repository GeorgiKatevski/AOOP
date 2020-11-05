package com.company;

import java.util.Scanner;

public class StockTest
{

    public static void main(String[] args)
    {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter previousPrice");
        double height=input.nextDouble();
        System.out.println("Please enter current");
        double width=input.nextDouble();
        Stock stock=new Stock(height,width);
        System.out.println( stock.changePercent());


/*
        Scanner input=new Scanner(System.in);
        String symbol=input.nextLine();
        String name=input.nextLine();
        Stock stock=new Stock(symbol,name);
        System.out.println( stock.changePercent());
*/



    }
}
