namespace Notification;

public static class NotificationService{
    public static void sendEmail(string reciever, string msg) {
        Console.WriteLine("Email sent to " + reciever + "; Message: " + msg);
    }
    public static void sendSMS(string reciever, string msg){
        Console.WriteLine("SMS sent to "+ reciever + "; Message: " + msg);
    }
}


