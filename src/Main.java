public class Main {
    public static void main(String[] args) {
        // Create instances
        NotificationService email = new EmailNotification();
        NotificationService sms = new SMSNotification();
        NotificationService push = new PushNotification();

        // Test with messages
        System.out.println("--- Notification System Test ---");

        // Using the interface reference (Polymorphism)
        email.sendNotification("New login detected!");
        sms.sendNotification("Meeting reminder! 2 PM");
        push.sendNotification("New message received!");
    }
}
