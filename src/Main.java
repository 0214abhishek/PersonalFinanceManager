import java.util.Scanner;

import model.Budget;
import model.Expense;
import model.Income;
import model.User;
import service.TransactionService;
import service.BudgetService;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      PERSONAL FINANCE MANAGER");
        System.out.println("====================================");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        User user = new User(1, name, email);

        TransactionService transactionService =
                new TransactionService();

        BudgetService budgetService =
                new BudgetService();

        boolean running = true;
        int transactionId = 100;

        System.out.println("\nAccount created successfully!");

        while (running) {

            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. View Profile");
            System.out.println("2. Add Income");
            System.out.println("3. Add Expense");
            System.out.println("4. View Transactions");
            System.out.println("5. Financial Summary");
            System.out.println("6. Set Budget");
            System.out.println("7. View Budgets");
            System.out.println("8. Exit");
            System.out.println("===============================");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    user.displayUser();
                    break;

                case 2:

                    System.out.print("Enter income amount: ");
                    double incomeAmount = scanner.nextDouble();
                    scanner.nextLine();
                    if (incomeAmount <= 0) {
                    System.out.println("Amount must be greater than zero.");
                    break;
}

                    System.out.print("Enter income source: ");
                    String source = scanner.nextLine();

                    System.out.print("Enter date: ");
                    String incomeDate = scanner.nextLine();

                    System.out.print("Enter description: ");
                    String incomeDescription = scanner.nextLine();

                    Income income = new Income(
                            transactionId++,
                            incomeAmount,
                            incomeDate,
                            incomeDescription,
                            source
                    );

                    transactionService.addTransaction(income);
                    break;

                case 3:

                    System.out.print("Enter expense amount: ");
                    double expenseAmount = scanner.nextDouble();
                    scanner.nextLine();
                    if (expenseAmount <= 0) {
                    System.out.println("Amount must be greater than zero.");
                    break;
}

                    System.out.print("Enter expense category: ");
                    String category = scanner.nextLine();

                    System.out.print("Enter date: ");
                    String expenseDate = scanner.nextLine();

                    System.out.print("Enter description: ");
                    String expenseDescription = scanner.nextLine();

                    if (budgetService.checkExpense(
                            category, expenseAmount)) {

                        Expense expense = new Expense(
                                transactionId++,
                                expenseAmount,
                                expenseDate,
                                expenseDescription,
                                category
                        );

                        transactionService.addTransaction(expense);

                    } else {

                        System.out.println(
                                "Expense was not added because it exceeds the budget."
                        );
                    }

                    break;

                case 4:

                    transactionService.showAllTransactions();
                    break;

                case 5:

                    transactionService.showFinancialSummary();
                    budgetService.showBudgetSummary();

                    break;

                case 6:

                    System.out.print("Enter budget category: ");
                    String budgetCategory = scanner.nextLine();

                    System.out.print("Enter budget limit: ");
                    double budgetLimit = scanner.nextDouble();
                    scanner.nextLine();
                    if (budgetLimit <= 0) {
                    System.out.println("Budget limit must be greater than zero.");
                    break;
}

                    Budget budget = new Budget(
                            budgetCategory,
                            budgetLimit
                    );

                    budgetService.addBudget(budget);
                    break;

                case 7:

                    budgetService.showBudgets();
                    break;

                case 8:

                    running = false;

                    System.out.println(
                            "Thank you for using Personal Finance Manager!"
                    );

                    break;

                default:

                    System.out.println(
                            "Invalid choice. Please enter a number from 1 to 8."
                    );
            }
        }

        scanner.close();
    }
}