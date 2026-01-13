package TightCoupling;

public class AppMain {
    public static void main(String[] args) {

        UserService userService = new UserService();
        userService.notifyUser("Order Placed!");
    }
}
