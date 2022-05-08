package appConfig;

import model.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
        @PropertySource("db.properties")
})
public class AppConfig {
    @Autowired
    private Environment environment;

    @Bean
    public Database database(){
        String url = this.environment.getProperty("url");
        String username = this.environment.getProperty("usernamee");
        String password = this.environment.getProperty("password");

        Database database = new Database();
        database.setUrl(url);
        database.setUsername(username);
        database.setPassword(password);

        return database;
    }
}
