package combinator;

public class CustomerValidator {
    private boolean isVaildEmail(String email){
        return email.contains("@");
    }

    private boolean isVaildPhn(String phn){
        return phn.contains("+0");
    }
}
