package com.joaquin.expensetracker.service;

import com.joaquin.expensetracker.model.Expense;

import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<Expense> expenses;

    public ExpenseManager() {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void showAllExpenses(){
        for (Expense expense : expenses) {
            System.out.println(expense.show());
        }
    }

    public double getTotalAmount(){
        double totalAmount = 0;
        for (Expense expense : expenses) {
            totalAmount += expense.getAmount();
        }
        return totalAmount;
    }
}
