package manager;
import java.util.ArrayList;
import model.User;
import model.*;

public class LoginManager {
    
    public User login(String username, String password, ArrayList<User> users) {
        for (User user : users) {
            if (user.getusername().equals(username) && user.password().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
