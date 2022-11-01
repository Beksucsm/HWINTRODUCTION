package com.beksucsm.oop.lesson11.hw;

public class ATMMachine {

    private int twenties;
    private int fifties;
    private int hundreds;

    public ATMMachine(int twenties, int fifties, int hundreds) {
        this.twenties = twenties;
        this.fifties = fifties;
        this.hundreds = hundreds;
    }

    public void depositCash(int twenties, int fifties, int hundreds) {
        setTwenties(getTwenties() + twenties);
        setFifties(getFifties() + fifties);
        setHundreds(getHundreds() + hundreds);
    }

    public boolean withdrawCash(int withdrawCashValue) {
        int twentiesCounter = 0;
        int fiftiesCounter = 0;
        int hundredsCounter = 0;

        int atmCash = atmCashValue();
        System.out.println("Max amount of money: " + atmCash);
        if (withdrawCashValue <= atmCash) {
            for (int i = withdrawCashValue / 100; i >= hundreds; i--) {
                hundredsCounter = i;
            }
            withdrawCashValue -= hundredsCounter * 100;

            for (int j = withdrawCashValue / 50; j >= fifties; j--) {
                fiftiesCounter = j;
            }
            withdrawCashValue -= fiftiesCounter * 50;

//            twentiesCounter = withdrawCashValue/20;
            for (int k = 0; k <= withdrawCashValue / 20; k++) {
                twentiesCounter = k;
            }

            System.out.println("Success");
            System.out.println(hundredsCounter + " Hundreds " + fiftiesCounter + " Fifties " + twentiesCounter + " Twenties.");

            return true;
        } else {
            System.out.println("Failure,try to withdraw less");
            return false;
        }
    }

    public int atmCashValue() {
        return (getTwenties() * 20 + getFifties() * 50 + getHundreds() * 100);
    }

    public int getTwenties() {
        return twenties;
    }

    public void setTwenties(int twenties) {
        this.twenties = twenties;
    }

    public int getFifties() {
        return fifties;
    }

    public void setFifties(int fifties) {
        this.fifties = fifties;
    }

    public int getHundreds() {
        return hundreds;
    }

    public void setHundreds(int hundreds) {
        this.hundreds = hundreds;
    }
}
