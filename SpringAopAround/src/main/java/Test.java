import com.company.appConfig.AppConfig;
import com.company.model.Employee;
import com.company.repository.EmployeeRepository;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeRepository employeeRepository = appContext.getBean("employeeRepository", EmployeeRepository.class);

        Employee employee = new Employee("Farid", "Java Software Developer", 5000.00);
        employeeRepository.save(employee);

        employeeRepository.find(0);
    }
}
