package techPrimers;
//https://www.youtube.com/playlist?list=PLTyWtrsGknYdqY_7lwcbJ1z4bvc5yEEZl

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapperExample {
    public static void main(String[] args) {
        List<User1> users = Arrays.asList(
                new User1("Tom", 20, Arrays.asList("3", "5", "8")),
                new User1("John", 30, Arrays.asList("7", "7", "3")),
                new User1("Robert", 45, Arrays.asList("6", "2", "1")),
                new User1("Kate", 25, Arrays.asList("1", "2"))
        );

        Optional<String> stringOptional = users.stream()
                .map(user -> user.getPhoneNumbers().stream())
                .flatMap(stringStream -> stringStream.filter(phoneNo -> phoneNo.equals("3")))
                .findAny();

        stringOptional.ifPresent(phNo-> System.out.println(phNo));

    }
    }
    
class User1{
    private String name;
    private Integer age;
    private List<String> phoneNumbers;

    public User1(String name, Integer age, List<String> phoneNumbers) {
        this.name = name;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "name=" + name +
                ", age=" + age;
    }
}
