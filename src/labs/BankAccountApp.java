package labs;

public class BankAccountApp
{
    public static void main(String[] args)
    {
        BankAccount acc1 = new BankAccount("465329874", 1000);
        System.out.println(acc1.toString());
    }
}
    class BankAccount implements IInterest
    {
        private static int id = 1000;                 //internal id
        private String accountNumber;   // id + random 2 digit number + first 2 ssn
        private static final String routingNumber = "005400657";
        private String name;
        private String sSN;
        private double balance;

        public BankAccount(String ssn, double initDeposit)
        {
            balance = initDeposit;
            this.sSN = ssn;
            id++;
            setAccountNumber();
        }
        private void setAccountNumber()
        {
            int random = (int) (Math.random() * 100);
            accountNumber = "" + id + random + sSN.substring(0,2);
            System.out.println(accountNumber);
        }
        public void setName(String name)
        {
            this.name = name;
        }
        public String getName()
        {
            return name;
        }
        public void payBill(double amount)
        {
            System.out.println("Paying bill $" + amount);
            balance -= amount;
            showBalance();
        }
        public void makeDeposit(double amount)
        {
            System.out.println("Making deposit $" + amount);
            balance += amount;
            showBalance();
        }
        public void showBalance()
        {
            System.out.println("Your balance: " + balance);
        }
        public void accrueInterest()
        {

        }

        @Override
        public void accrue()
        {
           balance = balance * (1 + rate / 100);
           showBalance();
        }
        @Override
        public String toString()
        {
            return "[Name: " + name + " ]\n[Account number: " + accountNumber + "]\n[Routing number: " + routingNumber + "]\n[Balance: " + balance +"]";
        }
    }

