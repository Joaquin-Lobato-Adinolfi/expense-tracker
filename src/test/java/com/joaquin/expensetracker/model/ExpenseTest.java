package com.joaquin.expensetracker.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExpenseTest {
    @Test
    public void createsValidExpense() {
        Expense coffee = new Expense("Coffee", 3500);

        assertEquals("Coffee", coffee.getDescription());
        assertEquals(3500, coffee.getAmount());
    }
    @Test
    void rejectsInvalidExpenseDescription() {
      assertThrows(IllegalArgumentException.class, () -> new Expense("", 3500));
     }

}
