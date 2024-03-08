namespace Tax;
// using Bank;
public static class TaxationService{
 
    public static void payServiceTax(int amount) {
        // this.Balance -= amount;
        Console.WriteLine("Servive Tax of " + amount + " rs deducted.");
    }

    public static void payIncomeTax(int amount) {
        // this.Balance -= amount;
        Console.WriteLine("Income Tax of " + amount + " rs deducted.");
    }

    public static void paySalesTax(int amount) {
        Console.WriteLine("Sales Tax of " + amount + "rs deducted");
    }

    public static void overBalance(int amount) {
        Console.WriteLine("Tax of " + amount + "rs deducted");
    }
}

