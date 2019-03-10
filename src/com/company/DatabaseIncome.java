package com.company;

public class DatabaseIncome {

    private Income[] incomes;

    // Databse array will contain all incomes
    public DatabaseIncome(int size) {
        this.incomes = new Income[size];
    }

    public Income[] getIncomes() {
        return incomes;
    }

    public void setIncomes(Income[] incomes) {
        this.incomes = incomes;
    }

    public void addIncome(Income income){
        for (int i=0; i<incomes.length;i++){
            if (incomes[i]==null){
                incomes[i]=income;
                break;
            }
        }
    }
    public void printIncomes(){
        for (int i=0; i<incomes.length;i++){
            if (incomes[i]!=null){
                System.out.println("Income nr: "+i+" "+incomes[i]);
            }
        }
    }
    public double sumNettoIncome() {
        double sumNettoIncome = 0;
        for (int i = 0; i < incomes.length; i++) {
            if (incomes[i] != null) {
                sumNettoIncome += (incomes[i].getBruttoIncome()*((100-incomes[i].getVatIncome())/100));
            }
        }
        //System.out.println("Netto cost sum:" + sumNettoIncome);
        return sumNettoIncome;
    }
    public double sumVatIncome(){
        //nettoincome - nettocost
        double sumVatIncome = 0;
        for (int i = 0; i < incomes.length; i++) {
            if (incomes[i] != null) {
                sumVatIncome += incomes[i].getBruttoIncome()*incomes[i].getVatIncome();
            }
        }
        //System.out.println("Netto cost sum:" + sumNettoCost);
        return sumVatIncome;

    }




}