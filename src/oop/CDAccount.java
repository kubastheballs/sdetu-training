package oop;

public class CDAccount extends BankAccount implements IRate
{
    double interestRate;

    void compound()
    {
        System.out.println("Compounding interest " + interestRate);
    }
}
