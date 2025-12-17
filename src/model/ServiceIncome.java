public class ServiceIncome extends Income implements Taxable {

    public ServiceIncome(double amount, String description) {
        super(amount, description);
    }

    @Override
    public double getTaxAmount() {
        return amount * 0.15 ;
    }

    @Override
    public  double getFinalAmount() {
        return amount - getTaxAmount() ;
    }

}
