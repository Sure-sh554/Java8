package org.example.lambda.function;
//class RunnableLambdaImpl implements Runnable{
//
//    @Override
//    public void run() {
//        System.out.println("run method called...");
//    }
//}
public class RunnableLambdaExample {

    public static void main(String[] args) {
//        Thread thread=new Thread(new RunnableLambdaImpl());
//        thread.start();

        Runnable runnable=()-> System.out.println("run method called using lambda");

        Thread threadLambda=new Thread(runnable);
        threadLambda.start();
    }
}
