package com.company.aop;

import com.company.model.User;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {

    @Before("within(com.company.repository.UserRepository)")
    public void userFindBeforeAdvice(){
        System.out.println("Session is begin!");
        System.out.println("Transaction is begin!");
        System.out.println("*********************");
    }

    @AfterReturning(pointcut = "execution(public * com.company.repository.UserRepository.find(*))", returning = "user")
    public void userFindAfterAdvice(User user){
        System.out.println("*********************");
        System.out.println("Transaction is over!");
        System.out.println("Session is over!");
        System.out.println("Good by " + user.getName() + "! ");
    }

    @AfterThrowing(pointcut = "execution(public void com.company.repository.UserRepository.save(*))", throwing = "exception")
    public void userSaveAdvice(RuntimeException exception){
        System.out.println("*********************");
        System.out.println("Transaction is over!");
        System.out.println("Session is over!");

        System.out.println("Error: " + exception);
    }
}
