package CH33;

import org.openqa.selenium.json.JsonOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Func1{
    void say(String message);
}
@FunctionalInterface
interface Func2{
    int sum(Integer ...args);
}
@FunctionalInterface
interface Func3{
    List<Integer> createListDesc(int... args);
}

public class C01FunctionalInterfaceMain {
    public static void main(String[] args) {
        Func1 func1 = (message) -> {
            System.out.println(message);
        };
        func1.say("HelloWorld");

        //01_1
        Func1 func1_1 = System.out::println;
        func1_1.say("Helloworld2");

        //02
        Func2 func2 = (arg) -> {
            int sum = 0;
            for (int el : arg)
                sum += el;
            return sum;
        };

        System.out.println(func2.sum(10, 20, 30, 40, 50, 60, 70, 9));

        //02_2
        Func2 func2_2 = (arg) -> {
            return Arrays.stream(arg)
                    .reduce(0, (sum, b) -> sum + b);

        };
        System.out.println(func2_2.sum(1, 2, 3, 4, 5, 6, 7, 8));
        //03
        Func3 func3 = (arg)->{
            return Arrays.stream(arg)
                    .boxed()
                    .sorted((a, b) -> b - a)
                    .collect(Collectors.toList());
        };
        List<Integer> li = func3.createListDesc(6, 55, 4, 22, 88, 999, 1, 1231);
        System.out.println(li);
    }
}

