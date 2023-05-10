public class Loans {
    public static void main(String[] args) {
        new Loans();
    }
    private double loanAmount;
    private double APR = 0.073;
    private double remainingBal;
    private double loanPayment;
    private int term;
    public Loans(double loanAmount, int term){
        this.loanAmount = loanAmount;
        this.term = term;
    }
    public double getAPR(){
        return APR;
    }
    public double getLoanAmount(){
        return loanAmount;
    }
    public double getRemainingBal(){
        return remainingBal;
    }
    public int getTerm(){
        return term;
    }
}
