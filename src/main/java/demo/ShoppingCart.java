package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status){
//        logging
//        authorization , authentication
//        sanatize the data
        System.out.println("checkout method from shopping card is called");
    }
    public int quantity(){
        return 2;
    }
}
