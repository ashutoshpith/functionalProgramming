package combinator;

import combinator.CustomerRegistrationValidator.ValidationResult;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ashutosh", "a@a.com", "+08675757555");

    ValidationResult result =  CustomerRegistrationValidator
              .isVaildEmail()
              .and(CustomerRegistrationValidator.isVaildPhn())
              .apply(customer);
    System.out.println(result);
    }
}
