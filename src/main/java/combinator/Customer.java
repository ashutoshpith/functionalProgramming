package combinator;

public class Customer {
    private final String name;
    private final String email;
    private final String phn;

    Customer(String name, String email, String phn){
        this.name = name;
        this.email = email;
        this.phn = phn;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhn() {
        return phn;
    }

    

}
