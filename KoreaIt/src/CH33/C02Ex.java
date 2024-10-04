package CH33;

import java.util.Arrays;

@FunctionalInterface
interface functional{
    int execute(int... args);
}
class Calc{
    functional sum;
    functional sub;
    functional mul;
    functional div;
    Calc(){
        sum = (arg)->{
        return  Arrays.stream(arg).reduce(0, (sum, b) -> sum + b);
        };

        sub = (arg)->{
            return Arrays.stream(arg)
                    .boxed()
                    .sorted((a,b)-> b - a)
                    .reduce(0, (sub, b) ->{
                        if(sub==0)
                            return b;
                        else
                            return sub-b;
                    });
        };
        mul = (arg)->{
            return Arrays.stream(arg).reduce(1, (mul, b) -> mul * b);
        };
        div = (arg)->{
        return Arrays.stream(arg).boxed().sorted((a,b)->(b-a)).reduce(10000,(div,b)->div/b);
        };
    }

    //sum,sub,mul,div 각각에 람다&스트림함수를 적절히 이용해서 기능 구현을 합니다
    //모든 인자를 받을 수 있는 가변인자 처리로 구현합니다.
    //뺄셈,나눗셈은 큰수에서 작은수로 정렬(sorted)한다음 누적 감산처리(reduce)를 합니다

}
public class C02Ex {
    public static void main(String[] args) {


        Calc calc = new Calc();
        System.out.println("합 : " + calc.sum.execute(10,20,30,40,50,60));
        System.out.println("몫 : " + calc.div.execute(10,20));
        System.out.println("차 : "+ calc.sub.execute(1,4,2,5));
        System.out.println("곱 : "+ calc.mul.execute(1,4,2,5));
    }
}
