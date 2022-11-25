package Chapter4;

public class CreditLimitCalculator {
    private int accountNumber;
    private int beginningBalance;
    private int totalCharged;
    private int totalCredits;
    private int allowedCreditLimit;

    public CreditLimitCalculator(int accountNumber, int beginningBalance, int totalCharged,
                                 int totalCredits, int allowedCreditLimit){
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.totalCharged = totalCharged;
        this.allowedCreditLimit = allowedCreditLimit;
        this.totalCredits = totalCredits;
    }
    public int setBalance(int beginningBalance, int totalCharged, int totalCredits){
        int newBalance = beginningBalance + totalCharged - totalCredits;
        if(newBalance > allowedCreditLimit){
            System.out.println("Credit limit exceeded");
        }
        return newBalance;
    }
}
