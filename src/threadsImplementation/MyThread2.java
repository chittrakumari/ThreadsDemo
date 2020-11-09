//Steps to create a thread using Thread class
//Thread class has already implemented  runnable interface
package threadsImplementation;
import java.util.*;

//extending thread class and overriding the run method.
public class MyThread2 extends Thread {
    public void run(){
        System.out.println("hello world thread class");
    }

}
