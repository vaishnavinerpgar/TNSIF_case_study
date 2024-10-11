public class User {
    protected int userId;
    protected String username;
    protected long contactNo;

    public User(int userId, String username, long contactNo) {
        this.userId = userId;
        this.username = username;
        this.contactNo = contactNo;
    }

    // Add this getter method
    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User{userId=" + userId + ", username='" + username + "', contactNo=" + contactNo + "}";
    }
}