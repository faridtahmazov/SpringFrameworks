package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {
    @Autowired
    private Database database;

    public DBConnection() {
    }

    public void getInfo(){
        System.out.println("Url: " + database.getUrl());
        System.out.println("Username: " + database.getUsername());
        System.out.println("Password: " + database.getPassword());
    }

    public DBConnection(Database database) {
        this.database = database;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
}
