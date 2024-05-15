package org.example.lambda;

interface Shape{
    void draw();

}
// Below class is the traditional way to implement the interface without lambda expression
//class Rectangle implements Shape{
//
//    @Override
//    public void draw() {
//        System.out.println("rectangle draw method");
//    }
//}
public class LambdaExample {
    public static void main(String[] args) {

       Shape rectangleDrawMethod=()-> System.out.println("rectangle draw method");
        rectangleDrawMethod.draw();
    }

}
