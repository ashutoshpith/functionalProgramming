package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
       System.out.println("Predicate");
       boolean a =  isPhoneValid.test("07000000000");
       System.out.println(a);
       boolean b =  isPhoneValid.test("0700000000");
       System.out.println(b);
       var k = isPhoneValid.and(containsNumber3).test("07635746564");
       System.out.println(k);
    }

    static Predicate<String> isPhoneValid = phn -> 
               phn.startsWith("07") && phn.length() == 11;
    
    static Predicate<String> containsNumber3 = phn -> 
               phn.contains("3");
}
