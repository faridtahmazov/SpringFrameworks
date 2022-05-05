import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public DBConnection dbConnection(){
        return new DBConnection("link", "tahmazovfarid", "123456");
    }
}
