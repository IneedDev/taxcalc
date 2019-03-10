package com.company;

public class DatabaseCost {
    private Cost[] costs;

    public DatabaseCost(int size) {
        this.costs = new Cost[size];
    }

    public Cost[] getCosts() {
        return costs;
    }

    public void setCosts(Cost[] costs) {
        this.costs = costs;
    }
    public void addCost(Cost cost){
        for (int i=0; i<costs.length;i++){
            if (costs[i]==null){
                costs[i]=cost;
                break;
            }
        }
    }
    public void printIncomes(){
        for (int i=0; i<costs.length;i++){
            if (costs[i]!=null){
                System.out.println("Income nr: "+i+" "+costs[i]);
            }
        }
    }

    public double sumNettoCost(){
        //nettoincome - nettocost

        double sumNettoCost = 0;
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] != null) {
                sumNettoCost += (costs[i].getBruttoCost()*((100-costs[i].getVatCost())/100));
            }
        }
        //System.out.println("Netto cost sum:" + sumNettoCost);
        return sumNettoCost;

    }

}
