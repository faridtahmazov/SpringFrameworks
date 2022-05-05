package appConfig;

import model.DBConnection;
import model.Database;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public DBConnection dbConnection() {
        DBConnection dbConnection = new DBConnection();
        dbConnection.setUrl("link");
        dbConnection.setUsername("tahmazovfarid");
        dbConnection.setPassword("123456");
        dbConnection.setDatabase(this.database());

        return dbConnection;
    }
    @Bean
    public Database database(){
        Database database = new Database();
        database.setName("Farid");
        database.setSurname("Tahmazov");
        database.setUsername("tahmazovfarid");

        return database;
    }
}
