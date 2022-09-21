package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void accountCanAcceptDepositTest() {
        //given that I have an account
    Account account1 = new Account();
        //when I deposit 5000
    account1.depositAmount(5000);
        //my balance increase by 5000
    assertEquals(5000, account1.getBalance());
    }

    @Test
    public void accountCanWithdrawTest() {
        //given that I have an account
    Account account1 = new Account();
        //And I have money in my account
    account1.depositAmount(5000);
    assertEquals(5000, account1.getBalance());
        //when I withdraw 3000 from the account
    account1.withdrawAmount(3000);
        //my account should reduce by 3000
    assertEquals(2000, account1.getBalance());
    }

    @Test
    public void negativeBalanceShouldNotDepositTest() {
        //given i have an account
    Account account1 = new Account();
        //when i have deposit a negative amount
    account1.depositAmount(-2000);
        //my balance remains the same
    assertEquals(0, account1.getBalance());

    }

}
