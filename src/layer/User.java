package layer;

public class User {
    public boolean isValidUser(String userName, String userPass){
        if(userName.equals("Thais") && userPass.equals("test123")){
            return true;
        }
        return false;
    }
}
