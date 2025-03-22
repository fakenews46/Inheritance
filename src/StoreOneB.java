class StoreOneB extends StoreToRent {
    public StoreOneB(boolean loanRequired, double loanAmount, int loanPaymentTerm) {
        super(!loanRequired, loanAmount, loanPaymentTerm);
    }

    public void prepareMenu() {
        System.out.println("Preparing the restaurant menu...");
    }
}
