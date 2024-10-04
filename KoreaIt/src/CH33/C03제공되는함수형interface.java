package CH33;
//제공되는 함수형 인터페이스들
//Function<T, R>:
//apply 메서드를 가지고 있어서 하나의 인자(T)를 받아서 결과(R)를 반환하는 함수형 인터페이스 입니다.

//Supplier<T>:
//get 메서드를 가지고 있어서 어떠한 인자도 받지 않고 결과만을 제공하는 함수형 인터페이스 입니다.
//
//Consumer<T>:
//accept 메서드를 가지고 있어서 어떠한 인자를 받아서 결과를 반환하지 않는 함수형 인터페이스 입니다.
//
//Predicate<T>:
//test 메서드를 가지고 있어서 어떠한 인자를 받아서 불리언 결과를 반환하는 함수형 인터페이스 입니다.
//
//UnaryOperator<T>:
//apply 메서드를 가지고 있어서 하나의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.
//
//BinaryOperator<T>:
//apply 메서드를 가지고 있어서 두 개의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class C03제공되는함수형interface {

    public static Function<Integer, Integer> func1 = x -> x * x;
    public static Function<Integer, Integer> func1_2 = x -> x + x;
    public static Function<List<Integer>, Integer> func1_3 = x -> x.stream().reduce(0, (sum, b) -> sum + b);
    public static Function<List<Object>, List<Integer>>func1_4= x->{
        return x.stream()
                .filter(el->{return el instanceof Integer;})
                .map(el->(Integer)el)
                .collect(Collectors.toList());

    };
    public static Function<Integer, Integer> func2 = func1.andThen(func1_2);
    public static Function<Integer, Integer> func2_2 = func1_2.andThen(func1);

    public static Function<Integer,Function<Integer,Integer>> func4 = x->y->x+y;

    public static BinaryOperator<Integer> func3=(x,y)->x+y;;

    public static void main(String[] args) {

        System.out.println(func1.apply(10));
        System.out.println(func1_2.apply(5));
        System.out.println(func1_3.apply(Arrays.asList(1,2,3,4,5,6,7)));
        List<Object> li1 = new ArrayList();
        li1.add(10);
        li1.add("김병관");
        li1.add("알페스");
        li1.add("sex");

        List<Integer> li2 = func1_4.apply(li1);
        System.out.println(li1);
        System.out.println(func2.apply(5));
        System.out.println(func2_2.apply(5));

        System.out.println(func3.apply(10,20));
        System.out.println(func4.apply(5).apply(10));

        //

    }
}
