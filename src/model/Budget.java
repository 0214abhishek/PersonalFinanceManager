package model;

public class Budget {

    private String category;
    private double limit;
    private double spent;

    public Budget(String category, double limit) {
        this.category = category;
        this.limit = limit;
        this.spent = 0;
    }

    public String getCategory() {
        return category;
    }

    public double getLimit() {
        return limit;
    }

    public double getSpent() {
        return spent;
    }

    public double getRemainingAmount() {
        return limit - spent;
    }

    public boolean canAddExpense(double amount) {
        return spent + amount <= limit;
    }

    public void addExpense(double amount) {
        spent += amount;
    }

    public void displayBudget() {

        System.out.println("\n----- Budget -----");
        System.out.println("Category  : " + category);
        System.out.println("Limit     : " + limit);
        System.out.println("Spent     : " + spent);
        System.out.println("Remaining : " + getRemainingAmount());

        if (spent >= limit) {
            System.out.println("Warning: Budget limit reached!");
        }
    }
}

