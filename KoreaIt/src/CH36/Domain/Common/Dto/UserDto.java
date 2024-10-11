package CH36.Domain.Common.Dto;

public class UserDto {
    private String username;
    private String password;
    private String role;
    private boolean isLocked;
    //디폴트 생성자
    public UserDto(){};
    //모든인자 생성자

    public UserDto(String username, String password, String role, boolean isLocked) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.isLocked = isLocked;
    }



    //getter and setter

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    //toSring

    @Override
    public String toString() {
        return "UserDto[" + "username='" + username + '\'' + ", password='" + password + '\'' + ", role='" + role + '\'' + ", isLocked=" + isLocked +']';
    }

}
