💰 CoinTrack - Personal Finance Manager
CoinTrack is a robust Java console application developed for personal finance management. This project was designed to demonstrate a solid understanding of fundamental Object-Oriented Programming (OOP) principles and Data Structures.

🚀 About the Project
The system allows the user to register different types of financial transactions (Income, Expenses, and Taxable Income) and dynamically calculates the final balance. The main objective is to solve a business problem using clean architecture and scalable code.

🧠 Key Concepts Applied
This project focuses on the practical application of:

Polymorphism: Handling different objects (Income, Expense) through a common superclass (Transaction), allowing the system to automatically calculate positive and negative values.

Inheritance & Abstraction: Use of an abstract base class Transaction to define the model for all financial records.

Interfaces: Implementation of the Taxable interface to handle specific business rules (such as tax calculations) only for applicable classes (ServiceIncome), adhering to the Interface Segregation Principle.

Collections Framework: Use of ArrayList<Transaction> to efficiently manage dynamic lists of data.

Package Organization: Separation of concerns into application (entry point) and model (business logic/entities).

🛠️ Technologies Used
Language: Java (JDK 17+)

Paradigm: Object-Oriented Programming (OOP)

Version Control: Git & GitHub

IDE: (e.g., Eclipse / IntelliJ IDEA)

📂 Project Structure
The code is organized to separate the program logic from the data representation:

src
├── application
│   └── Program.java      # Main class with the UI/Console logic
└── model
    ├── entities
    │   ├── Transaction.java  # Abstract superclass
    │   ├── Income.java
    │   ├── Expense.java
    │   └── ServiceIncome.java
    └── interfaces
        └── Taxable.java      # Interface for tax calculations
