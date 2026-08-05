package com.joaquin.expensetracker.model;

public class Expense {
    private String description;
    private double amount;

    public Expense(String description, double amount) {

        if (!isValidDescription(description)) {
            throw new IllegalArgumentException("Description cannot be left blank");
        }
        if (!isValidAmount(amount)) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        this.description = description;
        this.amount = amount;

    }

    private boolean isValidAmount(double amount){
        return amount >= 0;
    }

    private boolean isValidDescription(String description) {
        return !description.isBlank();
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}
