package appConfig;

import model.Database;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "model")
public class AppConfig {

    @Bean
    public Database database(){
        return new Database("jdbc:mysql://localhost:3306/database", "root", "0000");
    }
}
