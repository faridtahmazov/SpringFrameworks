package com.company.aop;

import com.company.model.Employee;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {

    @Around(value = "execution(public * com.company.repository.EmployeeRepository.find(*))")
    public void userAdvice(ProceedingJoinPoint pjp){
        try {
            System.out.println("Session is begin!");
            System.out.println("Transaction is begin!");

            Employee employee = (Employee) pjp.proceed();

            System.out.println("Transaction is over!");
            System.out.println("Session is over!");
            System.out.println("Salary: " + employee.getSalary());
        } catch (Throwable e) {
            e.printStackTrace();
        }

    }
}
