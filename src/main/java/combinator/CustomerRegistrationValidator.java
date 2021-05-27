package combinator;

import java.util.function.Function;

public interface CustomerRegistrationValidator
 extends Function<Customer, CustomerRegistrationValidator.ValidationResult> {
   
   enum ValidationResult{
       SUCCESS, 
       PHN_NOT_VALID,
       EMAIL_NOT_VALID
   } 

   static CustomerRegistrationValidator isVaildEmail(){
    return customer -> customer.getEmail().contains("@") 
          ? ValidationResult.SUCCESS 
          : ValidationResult.EMAIL_NOT_VALID;
}

   static CustomerRegistrationValidator isVaildPhn(){
    return customer -> customer.getPhn().contains("+0")
    ? ValidationResult.SUCCESS 
    : ValidationResult.PHN_NOT_VALID;

}

  default CustomerRegistrationValidator and(CustomerRegistrationValidator other){
      return customer -> {
          ValidationResult result = this.apply(customer);
          return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
      };
  }




}
