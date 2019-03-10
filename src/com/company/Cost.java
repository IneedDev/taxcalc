package com.company;

public class Cost {

    private String nameCost;
    private double bruttoCost;
    private double vatCost;


    public Cost(String nameCost, double bruttoCost, double vatCost) {
        this.nameCost = nameCost;
        this.bruttoCost = bruttoCost;
        this.vatCost = vatCost;
    }


    public String getNameCost() {
        return nameCost;
    }

    public void setNameCost(String nameCost) {
        this.nameCost = nameCost;
    }

    public double getBruttoCost() {
        return bruttoCost;
    }

    public void setBruttoCost(double bruttoCost) {
        this.bruttoCost = bruttoCost;
    }

    public double getVatCost() {
        return vatCost;
    }

    public void setVatCost(double vatCost) {
        this.vatCost = vatCost;
    }
}
