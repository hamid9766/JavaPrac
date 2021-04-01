package com.section2;

public class ExchangeRates {

    double[] ExchangeRates = new double[] {63, 3, 3, 595, 18, 107, 2};


    void printExchangeRates(){
        System.out.println("ExchangeRates lenght:" + ExchangeRates.length);
        System.out.println("rupee[0]: " + ExchangeRates[0]);
        System.out.println("dirham[1]: " + ExchangeRates[1]);
        System.out.println("real[2]: " + ExchangeRates[2]);
        System.out.println("chilean_peso[3]: " + ExchangeRates[3]);
        System.out.println("mexican_peso[4]: " + ExchangeRates[4]);
        System.out.println("yen[5]: " + ExchangeRates[5]);
        System.out.println("austrilan_$[6]: " + ExchangeRates[6]);

    }
    public static void main(String[] args){
        ExchangeRates e = new ExchangeRates();
        e.printExchangeRates();
    }
}
