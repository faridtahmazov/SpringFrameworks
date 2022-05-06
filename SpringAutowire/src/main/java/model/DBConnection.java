package model;

public class DBConnection {
    private Database database;

    public DBConnection(Database database) {
        this.database = database;
    }

    public DBConnection() {
    }

    public void openConnection(){
        System.out.println("Url: " + this.database.getUrl());
        System.out.println("Username: " + this.database.getUsername());
        System.out.println("Password: " + this.database.getPassword());
        System.out.println("*****");
        System.out.println("Connection is open!");
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
}
