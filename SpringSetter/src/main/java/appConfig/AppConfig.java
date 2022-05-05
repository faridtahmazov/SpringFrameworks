package appConfig;

import model.DBConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public DBConnection dbConnection(){
        DBConnection dbConnection = new DBConnection();
        dbConnection.setUrl("jdbc:mysql://localhost:3306/jpa");
        dbConnection.setUsername("root");
        dbConnection.setPassword("root");

        return dbConnection;
    }
}
