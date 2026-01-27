package com.example.LooseCoupling;

public class UserService {

    static NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public UserService() {

    }

    public static void notifyUser(String message){
        notificationService.send("hello");
    }

    //setter injection
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
