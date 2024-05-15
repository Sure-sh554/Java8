package org.example.lambda;


interface Shape{
    void draw();
}

public class LambdaExample {
    public static void main(String[] args) {
        String str="hello";

        Shape rectangle=  () -> System.out.println("Rectangle class draw method");
       // rectangle.draw();


        Shape square=   ()-> System.out.println("Square class draw method");
          //  square.draw();



       Shape circle= () -> System.out.println("Circle  class draw method");
         //   circle.draw();
            print(square);
            print(rectangle);
            print(circle);


    }

    private static void print(Shape shape){
        shape.draw();
    }

}
