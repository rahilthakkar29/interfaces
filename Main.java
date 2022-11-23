package com.rahil.tightlycouples;

public class Main {
    public static void main(String[] args) {
        TaxCalculator2022 calculator = new TaxCalculator2022(100_000);
        TaxReport report = new TaxReport(calculator);
        report.show();

        report.setCalculator(new TaxCalculator2023());
        report.show();
    }
}
