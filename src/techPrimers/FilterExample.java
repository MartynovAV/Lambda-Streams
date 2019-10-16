package techPrimers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterExample {
    public static void main(String[] args) {
        List<String> names= Arrays.asList(
                "Tom","John","Kate","Jack","Freddy",
                "Julie","Robert","Ava","Aleks","Lucie","Sam"
        );


        for (String name : names) {
            if(!name.equals("Sam")){
                System.out.println(name);
            }
        }

        System.out.println("Functional style:");

        names.stream()
                .filter(FilterExample::isNotSam)
                .forEach(System.out::println);


    }

    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }
}
