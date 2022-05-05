package model;

public class DBConnection {
    private String url;
    private String username;
    private String password;
    private Database database;

    public DBConnection() {
    }

    public DBConnection(String url, String username, String password, Database database) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.database = database;
    }

    public void openConnection(){
        System.out.println("Url: " + url);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Database: " + database);
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

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }


}
