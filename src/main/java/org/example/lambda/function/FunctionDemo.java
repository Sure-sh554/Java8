package org.example.lambda.function;

import java.util.function.Function;

//class FunctionImpl implements Function<String,Integer>{
//
//    @Override
//    public Integer apply(String s) {
//        return s.length();
//    }
//}
public class FunctionDemo {
    public static void main(String[] args) {

//        Function<String,Integer> function=new FunctionImpl();
//        Integer length=function.apply("Suresh");
//        System.out.println(length);


        Function<String,Integer> function=(String s) -> s.length();
        System.out.println(function.apply("Suresh"));

    }
}
