# Personal Finance Manager 💰

## About the Project

Managing personal expenses can become difficult when we don't keep track of where our money is going. I built this **Personal Finance Manager** as a simple Java console application to keep track of income, expenses, budgets, and the overall balance.

The main idea behind the project is to make basic financial tracking simple while also applying the **Object-Oriented Programming concepts** I have learned in Java.

This project is currently a console-based application, so everything is operated through the terminal.

---

## What Can You Do With It?

The application currently allows a user to:

* Create and view their basic profile.
* Add income with its source, date, and description.
* Add expenses with their category, date, and description.
* View all recorded transactions.
* See total income and total expenses.
* Check their current balance.
* Set budgets for different categories.
* Check whether an expense is within the set budget.
* View how much of each budget has been used.
* Get warnings when a budget limit is reached or exceeded.

---

## How It Works

When the program starts, it asks for the user's name and email.

After that, a menu is displayed:

```text
========== MAIN MENU ==========
1. View Profile
2. Add Income
3. Add Expense
4. View Transactions
5. Financial Summary
6. Set Budget
7. View Budgets
8. Exit
```

The user can select any option from the menu.

For example, if a user creates a **₹5,000 Food budget** and later tries to add a ₹6,000 food expense, the system checks the budget before adding the expense and prevents it if it exceeds the limit.

The current balance is calculated as:

```text
Balance = Total Income - Total Expenses
```

---

## Main Parts of the Project

I divided the project into different classes and packages so that each part has a specific responsibility.

### `model` package

This package contains the main objects used in the application.

* **User.java** – stores user information.
* **Transaction.java** – represents common transaction details.
* **Income.java** – represents income and extends `Transaction`.
* **Expense.java** – represents expenses and extends `Transaction`.
* **Budget.java** – handles budget limits and spending.

### `service` package

This package handles the main operations of the application.

* **TransactionService.java** – adds transactions, displays them, and calculates income, expenses, and balance.
* **BudgetService.java** – creates budgets, checks expenses against budgets, and displays budget summaries.

### `Main.java`

This is where the application starts.

It handles the menu, takes input from the user, and connects the different classes and services together.

---

## Project Structure

```text
PersonalFinanceManager/
│
├── README.md
├── .gitignore
│
└── src/
    ├── Main.java
    │
    ├── model/
    │   ├── User.java
    │   ├── Transaction.java
    │   ├── Income.java
    │   ├── Expense.java
    │   └── Budget.java
    │
    └── service/
        ├── TransactionService.java
        └── BudgetService.java
```

---

## Java Concepts Used

This project was also built to practice the Java concepts I have been learning.

### Object-Oriented Programming

The project uses classes and objects to represent users, transactions, income, expenses, and budgets.

### Inheritance

`Income` and `Expense` inherit common properties and methods from the `Transaction` class.

```text
             Transaction
              /       \
             /         \
        Income        Expense
```

### Encapsulation

Important data members are kept private or protected and are accessed through methods where required.

### Polymorphism

The application uses `Transaction` as a common type for both `Income` and `Expense` objects.

For example:

```java
ArrayList<Transaction> transactions;
```

This allows different types of transactions to be stored in the same collection.

### Method Overriding

Both `Income` and `Expense` provide their own version of the `displayTransaction()` method.

### ArrayList

`ArrayList` is used to store transactions and budgets while the program is running.

### Packages

The classes are separated into `model` and `service` packages to keep the project organized and modular.

---

## Technologies Used

* **Java**
* **Object-Oriented Programming**
* **ArrayList**
* **Java Scanner**
* **Git**
* **GitHub**
* **Visual Studio Code**

---

## Requirements

Before running the project, make sure Java is installed.

Check it using:

```bash
java -version
```

and:

```bash
javac -version
```

---

## How to Run

### 1. Clone the repository

```bash
git clone 
```

### 2. Go into the project folder

```bash
cd PersonalFinanceManager
```

### 3. Compile the project

```bash
javac -d out src/Main.java src/model/*.java src/service/*.java
```

### 4. Run the application

```bash
java -cp out Main
```

The application will then start in the terminal.

---

## Example

After adding some transactions, the financial summary can look like:

```text
========== FINANCIAL SUMMARY ==========
Total Income   : 30000.0
Total Expenses : 8500.0
Current Balance: 21500.0
```

A budget can look like:

```text
========== BUDGET SUMMARY ==========

Category  : Food
Limit     : 5000.0
Spent     : 3200.0
Remaining : 1800.0
Status    : Within budget
```

---

## Input Validation

The application also performs some basic validation.

For example:

* Income amount must be greater than zero.
* Expense amount must be greater than zero.
* Budget limit must be greater than zero.
* Invalid menu choices are handled with an appropriate message.

This helps prevent basic invalid input from affecting the application.

---

## Testing

I tested the main functions of the application using different scenarios, such as:

| Test                     | Expected Result                        |
| ------------------------ | -------------------------------------- |
| Add income               | Income is added                        |
| Add expense              | Expense is added                       |
| Enter invalid amount     | Amount is rejected                     |
| Create budget            | Budget is created                      |
| Expense within budget    | Expense is accepted                    |
| Expense exceeding budget | Expense is rejected                    |
| View transactions        | Transactions are displayed             |
| View financial summary   | Income, expenses and balance are shown |
| View budgets             | Budget information is displayed        |
| Invalid menu option      | Error message is shown                 |

---

## Current Limitations

This is currently a **console-based, in-memory project**.

That means:

* Data is available only while the program is running.
* Data is not permanently stored after closing the program.
* There is no database at the moment.
* There is no graphical user interface.

These are possible areas for future development.

---

## Future Improvements

If I continue developing this project, I would like to add features such as:

* Database support for permanent data storage.
* A graphical user interface.
* Monthly expense reports.
* Charts for visualizing spending.
* More detailed financial analysis.
* Report exporting.
* Support for multiple users.

---

## What I Learned

While building this project, I got practical experience with:

* Designing a Java project using multiple classes.
* Applying OOP concepts in a real project.
* Using inheritance and method overriding.
* Working with `ArrayList`.
* Organizing code using packages.
* Separating application logic into service classes.
* Taking and validating user input.
* Using Git and GitHub to manage the project.

---

## Project Status

🚧 **Currently Working**

The core functionality of the Personal Finance Manager has been implemented and tested.

More features can be added in the future as the project develops.

---

## Author

**Abhishek Singh**

B.Tech – Computer Science and Engineering (AI/ML)

---

## License

This project was created for academic and learning purposes.
