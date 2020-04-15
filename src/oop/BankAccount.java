package oop;

public class BankAccount implements IRate
{
    private String accountNumber;
    private static final String routingNumber = "0123456";
    private String name;
    private String ssn;
    private String accountType;
    private double balance = 0;

    BankAccount()
    {

    }

    BankAccount(String accountType)
    {

    }

    BankAccount(String accountType, double initDeposoit)
    {

    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void setRate() {

    }

    @Override
    public void increaseRate() {

    }

    void deposit(double amount)
    {
        balance += amount;
    }

    void withdraw(double withdraw)
    {
        balance -= withdraw;
    }

    void checkBalance()
    {

    }

    void getStatus()
    {

    }


}
