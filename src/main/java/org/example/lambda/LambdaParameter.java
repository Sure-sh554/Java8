package org.example.lambda;
interface Addable{
    int addition(int a, int b);
}

class AddableImpl implements Addable{

    @Override
    public int addition(int a, int b) {
        return (a+b);
    }
}
public class LambdaParameter {
    public static void main(String[] args) {


//       Addable addable= ( a,b) -> (a+b);
//       int result=addable.addition(10,20);
//        System.out.println(result);


       Addable abc=   (int a, int b) ->{
           int c=(a+b);
            return c;
        };

    }
}
