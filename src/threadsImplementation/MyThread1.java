
//Steps to create a thread using Runnable Interface


package threadsImplementation;

//implementing  runnable interface and overriding the run menthod.
// Runnable is an interface which has only one abstract method run().

public class MyThread1 implements Runnable {

    @Override
    public void run() {
        System.out.println("hello world from runnable interface");
    }
}
