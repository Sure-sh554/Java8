package org.example.lambda.methodReferences;

import java.util.function.BiFunction;
import java.util.function.Function;
@FunctionalInterface
interface Printable {
    void print(String msg);

}
public class MethodReferenceDemo {

    public static int addition(int a, int b){
        return (a+b);
    }

    public void display(String msg){
       msg= msg.toUpperCase();
        System.out.println(msg);
    }

    public static void main(String[] args) {
        //Method reference to a static method
        //Lambda Expression
        Function<Integer,Double>function=(input)->Math.sqrt(input);
        System.out.println(function.apply(4));
        //Method Reference
        Function<Integer,Double>functionMethodRef=Math::sqrt;
        System.out.println(functionMethodRef.apply(6));

        //lambda expression

        BiFunction<Integer,Integer,Integer> biFunction=(a,b)->MethodReferenceDemo.addition(a,b);
        System.out.println(biFunction.apply(10,20));

        //Using method reference
        BiFunction<Integer,Integer,Integer> function1=MethodReferenceDemo::addition;
        System.out.println(function1.apply(10,20));

        //Method reference to an instance method of an object
        MethodReferenceDemo methodReferenceDemo=new MethodReferenceDemo();
        //Lambda expression

        Printable printable= methodReferenceDemo::display;
        printable.print("Hello...");

        // Reference to the instance method of an arbitrary object
        //Sometimes, we call method of argument in the lambda expression
        //In that case, we can use a method reference to call an instance
        //method of an arbitrary object of a specific type

        Function<String,String> stringFunction=(String input)-> input.toLowerCase();




    }
}
