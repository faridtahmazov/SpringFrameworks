package appConfig;

import model.DBConnection;
import model.Database;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(autowire = Autowire.BY_NAME)
    public DBConnection dbConnection(){
        DBConnection dbConnection = new DBConnection();
        return dbConnection;
    }

    @Bean(name = "database")
    public Database database(){
        Database database = new Database();
        database.setUsername("tahmazovfarid");
        database.setUrl("link");
        database.setPassword("121212");

        return database;
    }
}
