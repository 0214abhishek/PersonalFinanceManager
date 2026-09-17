package model;

public class Expense extends Transaction {

    private String category;

    public Expense(int transactionId, double amount,
                   String date, String description, String category) {

        super(transactionId, amount, date, description);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public void displayTransaction() {

        System.out.println("\n----- Expense -----");
        System.out.println("Transaction ID : " + transactionId);
        System.out.println("Amount         : " + amount);
        System.out.println("Date           : " + date);
        System.out.println("Category       : " + category);
        System.out.println("Description    : " + description);
    }
}