package estaticos;

public class User {
    private String username;
    private String password;
    public static int num = 0;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        User.num = num;
    }
}
