public class Expense extends Transaction {

    public Expense(double amount, String description) {
        super(amount, description);
    }

    @Override
    public double getFinalAmount() {
        return -amount;
    }
}
