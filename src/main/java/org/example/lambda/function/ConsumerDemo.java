package org.example.lambda.function;

import java.util.function.Consumer;

//class ConsumerImpl implements Consumer<String>{
//
//    @Override
//    public void accept(String input) {
//        System.out.println(input);
//    }
//}
public class ConsumerDemo {
    public static void main(String[] args) {
//        Consumer<String> stringConsumer=new ConsumerImpl();
//        stringConsumer.accept("Hello World");


       Consumer<String>stringConsumer= (input)-> System.out.println(input);
       stringConsumer.accept("Hello World");

    }

}
