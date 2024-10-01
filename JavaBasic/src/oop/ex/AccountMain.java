package oop.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.Deposit(10000);
        account.Withdraw(9000);
        account.Withdraw(2000);
        System.out.println("잔고 :" + account.balance);
    }
}
