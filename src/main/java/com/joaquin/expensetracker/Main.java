package com.joaquin.expensetracker;

import com.joaquin.expensetracker.model.Expense;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Expense coffe = new Expense("Coffee", 5500);

        Expense testOne = new Expense("Test one", -1);

        Expense testTwo = new Expense("", 6000);
    }
}