package model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DBConnection {
    private String username;
    private String password;
    private List<String> list;
    private Map<String, String> map;
    private Properties properties;

    public void openConnection(){
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        System.out.println("In the list: ");
        for (String str: list) {
            System.out.println("\t - " + str);
        }

        System.out.println("In the map: ");
        Set<String> keySet = this.map.keySet();
        for (String key: keySet) {
            System.out.println("\t - " + key + ": " + this.map.get(key));
        }

        System.out.println("In the properties: ");
        Set<String> props = this.properties.stringPropertyNames();
        for (String prop: props) {
            System.out.println("\t - " + prop + ": " + this.properties.getProperty(prop));
        }

        System.out.println("\n\nConnection opened!");
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

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
