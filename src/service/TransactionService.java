package service;

import java.util.ArrayList;
import model.Expense;
import model.Income;
import model.Transaction;

public class TransactionService {

    private ArrayList<Transaction> transactions;

    public TransactionService() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        System.out.println("Transaction added successfully.");
    }

    public void showAllTransactions() {

        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        System.out.println("\n========== TRANSACTIONS ==========");

        for (Transaction transaction : transactions) {
            transaction.displayTransaction();
        }
    }

    public double getTotalIncome() {

        double total = 0;

        for (Transaction transaction : transactions) {

            if (transaction instanceof Income) {
                total += transaction.getAmount();
            }
        }

        return total;
    }

    public double getTotalExpenses() {

        double total = 0;

        for (Transaction transaction : transactions) {

            if (transaction instanceof Expense) {
                total += transaction.getAmount();
            }
        }

        return total;
    }

    public double getBalance() {
        return getTotalIncome() - getTotalExpenses();
    }

    public void showFinancialSummary() {

        double income = getTotalIncome();
        double expenses = getTotalExpenses();
        double balance = getBalance();

        System.out.println("\n========== FINANCIAL SUMMARY ==========");
        System.out.println("Total Income   : " + income);
        System.out.println("Total Expenses : " + expenses);
        System.out.println("Current Balance: " + balance);
    }
}