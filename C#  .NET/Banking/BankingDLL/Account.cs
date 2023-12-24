namespace Bank;
using Delegates;
public class Account{
    // defining event passing it to delegate
    public event NotificationOperation underBalance;
    public event TaxOperation overBalance;

    public int Balance{get;set;}
    public void Deposit(int amount){
        this.Balance += amount;
        // Console.WriteLine(amount + "rs Deposited");
        if(this.Balance >= 2500000){
            overBalance(5000);  // event fired
        }
    }
    public void Withdraw(int amount){
        this.Balance -= amount;
        // Console.WriteLine(amount + "rs Withdrawn");
        if(this.Balance<=10000) {
            // event fired
            underBalance("Pratik", "Account Freezed, underbalanced");
        }
    }

}

