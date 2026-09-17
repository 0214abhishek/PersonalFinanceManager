package model;

public class Income extends Transaction {

    private String source;

    public Income(int transactionId, double amount,
                  String date, String description, String source) {

        super(transactionId, amount, date, description);
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    @Override
    public void displayTransaction() {

        System.out.println("\n----- Income -----");
        System.out.println("Transaction ID : " + transactionId);
        System.out.println("Amount         : " + amount);
        System.out.println("Date           : " + date);
        System.out.println("Source         : " + source);
        System.out.println("Description    : " + description);
    }
}