using Bank;
using Delegates;
using Notification;
using Tax;

Account acc1 = new Account();

acc1.Balance = 50000;

acc1.Deposit(5000);

Console.WriteLine("Current Balance: " + acc1.Balance + "rs.");

acc1.Withdraw(1500);

Console.WriteLine("Current Balance: " + acc1.Balance + "rs.");

//Direct Call Synchronous Call
// NotificationService.sendEmail("Pratik", "Account Active");

//Indirect Call (Asynchronous Call) using delegate
// NotificationOperation notify = new NotificationOperation(NotificationService.sendEmail);
// notify.Invoke("Pratik", "Account Active");

// Chaining multiple functions for delegate call
NotificationOperation proxyEmail = new NotificationOperation(NotificationService.sendEmail);
NotificationOperation proxySMS = new NotificationOperation(NotificationService.sendSMS);

NotificationOperation proxy=null;
// chaining
proxy+=proxyEmail;
proxy+=proxySMS;

// proxy.Invoke("Pratik", "Account Active");

// dechaining function from delegate call
proxy-=proxyEmail;

// proxy.Invoke("Pratik", "Account Active");
Console.WriteLine("Event Driven Application");

Account acc02 = new Account();

// attach event handler before working object operation
acc02.overBalance += TaxationService.payIncomeTax;
acc02.overBalance += TaxationService.payServiceTax;
acc02.overBalance += TaxationService.paySalesTax;

acc02.underBalance += NotificationService.sendEmail;
acc02.underBalance += NotificationService.sendSMS;

acc02.Balance = 200000;
acc02.Deposit(70000);
Console.WriteLine("Balance: " + acc02.Balance);
acc02.Withdraw(260000);

Console.WriteLine("Balance: " + acc02.Balance);

