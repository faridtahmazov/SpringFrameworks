package daoImpl;

import dao.DBConnection;
import org.springframework.beans.factory.annotation.Required;

public class MysqlDBConnectionImpl implements DBConnection {
    private String url;
    private String username;
    private String password;

    @Override
    public void openConnection() {
        System.out.println("Url: " + this.url);
        System.out.println("Username: " + this.username);
        System.out.println("Password: " + this.password);


        System.out.println("Connected to Mysql database!");
    }

    @Override
    public void closeConnection() {
        System.out.println("Mysql database connection is closed!");
    }

    public String getUrl() {
        return url;
    }

    @Required
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    @Required
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    @Required
    public void setPassword(String password) {
        this.password = password;
    }
}
