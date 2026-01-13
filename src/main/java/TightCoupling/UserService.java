package TightCoupling;

public class UserService {
    NotificationService notificationService = new NotificationService();
    public void notifyUser(String message){
        notificationService.send("Hello this is my notification service");
    }
}
