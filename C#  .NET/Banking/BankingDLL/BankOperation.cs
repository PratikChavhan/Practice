namespace Delegates;
using Bank;
using Notification;
using Tax;

public delegate void TaxOperation(int amount);

public delegate void NotificationOperation(string reciever, string message);


