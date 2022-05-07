package model;

public class DBConnection {
    private String url;
    private String username;
    private String password;

    private void validation(){
        if (this.url == null || this.username == null || this.password == null)
            throw new NullPointerException("Can't connect database!");
        else{
            System.out.println("Connection is a successful!");
        }
    }

    public void openConnection(){
        System.out.println("Open connection!");
    }

    private void closeConnection(){
        System.out.println("Connection is closed!");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    @Override
    public String toString() {
        return "DBConnection{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
