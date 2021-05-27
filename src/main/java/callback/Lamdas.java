package callback;

import java.util.function.Function;

public class Lamdas {
    public static void main(String[] args) {
        Function<String, String> name = String::toUpperCase;
    }
    
}
