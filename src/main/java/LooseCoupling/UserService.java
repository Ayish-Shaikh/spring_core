package LooseCoupling;

public class UserService {

    NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message){
        notificationService.send("hello");
    }

    //setter injection
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
