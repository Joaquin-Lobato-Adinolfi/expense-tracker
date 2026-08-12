package com.joaquin.expensetracker;

import com.joaquin.expensetracker.model.Expense;
import com.joaquin.expensetracker.service.ExpenseManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Expense coffee = new Expense("Coffee", 5500);
        Expense lunch = new Expense("Lunch", 12000);
        Expense uber = new Expense("Uber", 9500);

        ExpenseManager testManager = new ExpenseManager();

        testManager.addExpense(coffee);
        testManager.addExpense(lunch);
        testManager.addExpense(uber);
        testManager.showAllExpenses();
        System.out.println("Total amount: $" + testManager.getTotalAmount());
    }
}