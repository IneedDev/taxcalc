package com.company;

public class Income {

    private double bruttoIncome;
    private double vatIncome;

    public Income(double bruttoIncome, double vatIncome) {
        this.bruttoIncome = bruttoIncome;
        this.vatIncome = vatIncome;
    }


    public double getBruttoIncome() {
        return bruttoIncome;
    }

    public void setBruttoIncome(double bruttoIncome) {
        this.bruttoIncome = bruttoIncome;
    }

    public double getVatIncome() {
        return vatIncome;
    }

    public void setVatIncome(double vatIncome) {
        this.vatIncome = vatIncome;
    }

    @Override
    public String toString() {
        return "Income{" +
                "bruttoIncome=" + bruttoIncome +
                ", vatIncome=" + vatIncome +
                '}';
    }
}
