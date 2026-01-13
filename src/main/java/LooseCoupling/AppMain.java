package LooseCoupling;

public class AppMain {
    public static void main(String[] args) {

        NotificationService emailService = new EmailNotificationService();
        NotificationService smsService = new SMSNotificationService();

        UserService userService1 = new UserService(emailService);
        UserService userService2 = new UserService(smsService);

        userService1.notifyUser("Order Placed!");
        userService2.notifyUser("Order Placed!");

    }
}
