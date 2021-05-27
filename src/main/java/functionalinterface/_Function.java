package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function{
    public static void main(String[] args) {
      int number = increment(2);
      System.out.println(number);
      int n= incrementByOneFunction.apply(7);
      System.out.println(n);
      String con = concateValue.apply("mountain");
      System.out.println(con);
      var k = addMultiply.apply(2);
      System.out.println(k);
      var p = addMultiplyBi.apply(2, 3);
      System.out.println(p);

        
    }
   static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
   static Function<Integer, Integer> multiply = number -> number * 10;
   static Function<Integer, Integer> addMultiply = incrementByOneFunction.andThen(multiply);
   static Function<String, String> concateValue = val -> val + " star";
   static BiFunction<Integer, Integer, Integer> addMultiplyBi = (add, multiply) -> (add + 1) * multiply;
   static int increment(int number){
        return number + 1;
    }
}