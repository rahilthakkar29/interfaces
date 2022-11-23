package com.rahil.tightlycouples;

/*
This is an example of tightly-coupled class.
For example, in this class we are creating a new object of TaxCalculator in our constructor.
So, in future if we change the implementation of TaxCalculator, we also need to change the implementation of this
class as well.
Even though, we don't change any signature of methods or constructor, if we change
just one implementation, like in calculateTax method we change 0.3 => 0.4
,and we have 10 classes that uses that method, we need to recompiled and redeployed all the dependencies.
 */

public class TaxReport {
    private TaxCalculator2022 calculator;

    public TaxReport(){
        calculator = new TaxCalculator2022(100_000);
    }

    public void show(){
        double tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
