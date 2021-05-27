package callback;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("Jong", null, val -> {
            System.out.println("Last name not provided");
        });

        hello2("Jong", null, () -> {
            System.out.println("Last name not provided");
        });
    }

    static void hello(String name, String lastName, Consumer<String> callback){ 
       System.out.println(name);
       if(lastName != null){
           System.out.println(lastName);
       }
       else{
           callback.accept(name);
       }

    }

    static void hello2(String name, String lastName, Runnable callback){ 
        System.out.println(name);
        if(lastName != null){
            System.out.println(lastName);
        }
        else{
            callback.run();
        }
 
     }
}
