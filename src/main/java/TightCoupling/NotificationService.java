package TightCoupling;

public class NotificationService {
    public void send(String message){
        //SMS
        System.out.println("Notification received: " + message);
    }
}
