package inparitive;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Person> people = List.of(
                new Person("Cohn", Gender.FEMALE),
                new Person("John", Gender.MALE),
                 new Person("Aohn", Gender.MALE),
                 new Person("Bohn", Gender.FEMALE)
        );
        // Imperative approach
        // List<Person> females = new ArrayList<>();
        // for (Person person :people){
        //     if (Gender.FEMALE.equals(person.gender)){
        //         females.add(person);
        //     }
        // }

        // for (Person female: females){
        //     System.out.println(female);
        // }

        // Declarative approach
        Predicate<Person> personPredicate = person -> person.gender.equals(Gender.FEMALE);
        
        people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        people.stream()
            .filter(personPredicate)
            .forEach(System.out::println);
  
    }

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

interface D{
    String getName();
}
class A implements D{
    @Override
    public String getName() {
        return "Hello A";
    }
}
class B implements D{
    @Override
    public String getName() {
        return "Hello B";
    }
}
class C{
    static void check(D d, Optional<String> k){
        String g = k.orElse("hi");
        System.out.println(d.getName());
    }
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        check(a, null);
        b.getName();
        System.out.println();
    }
}