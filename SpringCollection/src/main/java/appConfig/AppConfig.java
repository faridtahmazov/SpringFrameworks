package appConfig;

import model.DBConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class AppConfig {
    @Bean
    public DBConnection dbConnection(){
        DBConnection dbConnection = new DBConnection();
        dbConnection.setUsername("tahmazovfarid");
        dbConnection.setPassword("123456");

        List<String> list = new ArrayList<>();
        list.add("min 1 connection");
        list.add("max 20 connection");
        list.add("100 cacheable statement");

        dbConnection.setList(list);

        Map<String, String> map = new HashMap<>();
        map.put("minConnection", "1");
        map.put("maxConnection", "20");
        map.put("maxCacheStatements", "100");

        dbConnection.setMap(map);

        Properties properties = new Properties();
        properties.put("url", "jdbc:mysql://localhost:3306/database?createDatabaseIfNotExist=true");
        properties.put("username", "root");
        properties.put("password", "hah");

        dbConnection.setProperties(properties);

        return dbConnection;
    }
}
