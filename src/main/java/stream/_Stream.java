package stream;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Cohn", Gender.FEMALE),
            new Person("John", Gender.MALE),
             new Person("Aohn", Gender.MALE),
             new Person("Bohn", Gender.FEMALE)
    );
    people.stream()
            .map(nameShow)
            .mapToInt(length)
            .forEach(println);
   var containsFemales =  people.stream()
            .anyMatch(female);
            System.out.println(containsFemales);
    }

    static Predicate<Person> female = pe -> pe.gender.equals(Gender.FEMALE);
    static Function<Person, String> nameShow = pe -> pe.name;
    static ToIntFunction<String> length = String::length;
    static IntConsumer println = System.out::println;
    
    static class Person{
        private final String name;
        private final Gender gender;

    Person(String name, Gender gender){
        this.name = name;
        this.gender = gender;
    }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum  Gender {
        MALE,FEMALE
    }
}
