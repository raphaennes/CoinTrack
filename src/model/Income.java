public class Income extends Transaction {

    public Income(double amount, String description) {
        super(amount, description);
    }

    @Override
    public double getFinalAmount() {
        return amount;
    }
}
