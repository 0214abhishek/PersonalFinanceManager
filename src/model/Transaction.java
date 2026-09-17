package model;

public class Transaction {

    protected int transactionId;
    protected double amount;
    protected String date;
    protected String description;

    public Transaction(int transactionId, double amount,
                       String date, String description) {

        this.transactionId = transactionId;
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    public void displayTransaction() {
        System.out.println("Transaction ID : " + transactionId);
        System.out.println("Amount         : " + amount);
        System.out.println("Date           : " + date);
        System.out.println("Description    : " + description);
    }

    public double getAmount() {
        return amount;
    }
}