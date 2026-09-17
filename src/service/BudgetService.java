package service;

import java.util.ArrayList;
import model.Budget;

public class BudgetService {

    private ArrayList<Budget> budgets;

    public BudgetService() {
        budgets = new ArrayList<>();
    }

    public void addBudget(Budget budget) {

        budgets.add(budget);

        System.out.println("Budget created successfully.");
    }

    public Budget findBudget(String category) {

        for (Budget budget : budgets) {

            if (budget.getCategory().equalsIgnoreCase(category)) {
                return budget;
            }
        }

        return null;
    }

    public boolean checkExpense(String category, double amount) {

        Budget budget = findBudget(category);

        if (budget == null) {
            return true;
        }

        if (!budget.canAddExpense(amount)) {

            System.out.println("\nBudget limit exceeded!");
            System.out.println("Category : " + category);
            System.out.println("Budget   : " + budget.getLimit());
            System.out.println("Spent    : " + budget.getSpent());
            System.out.println("Remaining: " + budget.getRemainingAmount());

            return false;
        }

        budget.addExpense(amount);
        return true;
    }

    public void showBudgets() {

        if (budgets.isEmpty()) {
            System.out.println("No budgets have been created.");
            return;
        }

        System.out.println("\n========== BUDGETS ==========");

        for (Budget budget : budgets) {
            budget.displayBudget();
        }
    }
}

