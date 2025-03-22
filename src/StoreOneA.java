class StoreOneA extends StoreToRent {
    private static final double DISCOUNT_RATE = 0.1;
    private boolean specialCustomer;
    private double monthlyPayment;

    public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm, boolean specialCustomer) {
        super(loanRequired, loanAmount, loanPaymentTerm);
        this.specialCustomer = specialCustomer;
    }

    public void showStoreInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "LOAN DETAILS (if applicable):\n" +
                "Loan Amount: " + getLoanAmount() + "\n" +
                                "Loan Payment Term: " + getLoanPaymentTerm() + "\n" +
                                "Interest Rate: " + getINTEREST_RATE() + "\n" +
                                "Special Customer: " + specialCustomer + "\n" +
                                "Monthly Loan Payment: " + calculateLoanFinancing();
                    }
                
                    private String getLoanAmount() {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'getLoanAmount'");
                    }
                
                    /**
                     * @return
                     */
                    @Override
    public double     public class StoreToRent {
        // existing code
    
        public double calculateLoanFinancing() {
            // Implementation of the method
            return 0.0;
        }

        @Override
        public String toString() {
            return "StoreToRent []";
        }
    } {
        monthlyPayment = super.calculateLoanFinancing();
        if (specialCustomer) {
            monthlyPayment -= (monthlyPayment * DISCOUNT_RATE);
        }
        return monthlyPayment;
    }
}
