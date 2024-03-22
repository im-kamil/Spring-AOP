package demo;

import org.junit.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.net.SocketTimeoutException;

@EnableAspectJAutoProxy
@Component

public class AuthenticationAspect {

    @Pointcut("within(demo..*)")
    public void AuthenticationPointCut(){
        System.out.println("Authentication");
    }
    @Pointcut("within(demo.ShoppingCart.*)")
    public void AuthenticationPointCut(){

    }
    @Before("authenticatingPointCut() && autherizationPointCut()")
    public void authenticate(){
        System.out.println("Authentucating the requests");
    }
    @Pointcut("execution(*demo.ShoppingCart.quantity(..)")
    public void afterReturningPointCut(){}

    @AfterReturning(pointcut="afterReturningPointCut()", returning="returnVal")
    public void afterReturning(String returnVal){
        System.out.println("After returning:" +returnVal);
    }
}
