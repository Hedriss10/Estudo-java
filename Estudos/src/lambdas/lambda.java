package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lambda {

    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Hedris", "Rocha", "Pereira");

        for (String string_list : strs) {
            System.out.println(string_list);
        }
        System.out.println("Expressões lambdas");
        strs.forEach(stringList -> System.out.println(stringList));

        List<String> result = strs.stream().filter(str -> str.startsWith("H")).collect((Collectors.toList()));

        result.forEach(Person::say);

    }
}