package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        System.out.println("_Consumer");
        Customer customer = new Customer("ashutosh", "344");
        greetWithConsumer.accept(customer);
        greetWithConsumerShowPhn.accept(customer, false);
        greetWithConsumerShowPhn.accept(customer, true);

    }
    
    static void greetCustomer(Customer customer){
        System.out.println("Hello "+ customer.customerName);
    }

    static Consumer<Customer> greetWithConsumer = cusotmer -> 
                           System.out.println(
                                    "Hello "
                                  + cusotmer.customerName
                                  + " "
                                  + cusotmer.customerPhone)
                                  ;
    
    static BiConsumer<Customer, Boolean> greetWithConsumerShowPhn = (cusotmer, phn) -> 
    System.out.println(
            "Hello "
            + cusotmer.customerName 
            + " "
            + (phn ? cusotmer.customerPhone: "*****"))
            ;

                                    

    static class Customer {
        private final String customerName;
        private final String customerPhone;

        Customer(String name, String phn){
            this.customerName = name;
            this.customerPhone = phn;
        }
    }
}
