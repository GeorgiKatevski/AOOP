package com.company;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.setpreviousClosingPrice(previousClosingPrice);
        this.setCurrentPrice(currentPrice);
    }

    public Stock(double previousClosingPrice, double currentPrice) {
        this.setpreviousClosingPrice(previousClosingPrice);
        this.setCurrentPrice(currentPrice);
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setpreviousClosingPrice(double price) {
        if (price == 0) {
            this.previousClosingPrice = 1;
        } else {
            this.previousClosingPrice = price;
        }
    }

    public void setCurrentPrice(double price) {
        if (price == 0) {
            this.currentPrice = 1;
        } else {
            this.currentPrice = price;
        }
    }

    public double changePercent() {
        return ((previousClosingPrice - currentPrice) / previousClosingPrice) * 100;
    }


}
