import Model.Expense;
import Model.Income;
import Model.ServiceIncome;
import Model.Transaction;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        ArrayList<Transaction> transactions = new ArrayList<>();

        transactions.add(new Income(600, "Salary"));
        transactions.add(new Expense(200, "Suit"));
        transactions.add(new ServiceIncome(150, "Work overtime"));

        double balance = 0;

        System.out.println("--- Statement ---");
        for (Transaction t : transactions) {
            System.out.println(t.getDescription() + ": " + t.getFinalAmount());
            balance += t.getFinalAmount();
        }

        System.out.println("-----------------");
        System.out.println("Total Balance: " + balance);
    }

}

