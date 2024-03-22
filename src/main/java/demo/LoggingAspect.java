package demo;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
public class LoggingAspect {
    @Before("execution(* demo.ShoppingCart.checkout())")
    public void Beforelogger(joinPoint jp){
//        System.out.println(jp.getSignature());
        String args = jp.getArgs()[0].toString();
        System.out.println("Logger");
    }
    @After("execution(* .* .* checkout()")
    public void Afterlogger(){
        System.out.println("Afterlogger");
    }
}
