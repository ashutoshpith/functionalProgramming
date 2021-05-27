package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println("_Supplier");
        System.out.println(getDbConnectionUrl.get());

    }

    static String getDbConnection(){
        return "jdbc://local:5432/users";
    }

    static Supplier<String> getDbConnectionUrl = () -> "jdbc://local:5432/users";
}
