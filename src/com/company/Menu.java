package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void menu(){
        DatabaseIncome databaseIncome = new DatabaseIncome(10);
        DatabaseCost databaseCost = new DatabaseCost(10);
        int action=0;

        while (action!=4){

            System.out.println("1. Add income");
            System.out.println("2. Add cost");
            System.out.println("3. Calculate Vat");
            System.out.println("4. Exit");
            String caseNumbers = scanner.next();
            int caseNumber = Integer.parseInt(caseNumbers);

            switch (caseNumber){
                case 1:
                    System.out.println("Add income");
                    System.out.println("Income brutto");
                    double bruttoIncome = scanner.nextDouble();
                    System.out.println("Income Vat");
                    double vatIncome = scanner.nextDouble();
                    // income object creation based on user input and defined constructor
                    Income income = new Income(bruttoIncome,vatIncome);
                    databaseIncome.addIncome(income);
                    break;
                case 2:
                    System.out.println("Add cost");
                    System.out.println("Cost name");
                    String nameCost = scanner.next();
                    System.out.println("Cost brutto");
                    double bruttoCost = scanner.nextDouble();
                    System.out.println("Cost Vat");
                    double vatCost = scanner.nextDouble();
                    // cost object creation based on user input and defined constructor
                    Cost cost = new Cost(nameCost,bruttoCost,vatCost);
                    databaseCost.addCost(cost);
//                  System.out.println("Print incomes");
//                  databaseIncome.printIncomes();
                    break;
                case 3:
                    System.out.println("Calculate VAT");
                    databaseIncome.sumNettoIncome();
                    databaseCost.sumNettoCost();
                    System.out.println("Income Tax: "+(databaseIncome.sumNettoIncome()-databaseCost.sumNettoCost())*0.18);
                    System.out.println("Vat to pay: "+((databaseCost.sumVatCost()+databaseIncome.sumVatIncome())-databaseCost.sumNettoCost());

                    break;
                case 4:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Not correct input");
                    break;
            }
        }


    }


}
