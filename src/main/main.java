package main;

import threadsImplementation.MyThread1;
import threadsImplementation.MyThread2;

public class main {
    public static void main(String[] args){
        

        //The following steps are creation of thread using Runnable interface.
        
        
        //Step 2:We are creating the reference of runnable.
        // we can also do it by creating a object of MyThread1 class i.e MyThread1 r=new MyThread1
        Runnable r=new MyThread1();



        /* Step 3:Creating thread class object and passing the reference of runnable.This will associate our run method with start method of thread class.
        Thread is a library class in java.lang package
         */
        Thread t1=new Thread(r);

        //Calling the start method to invoke the run()
        t1.start();



        

        //The following steps are creation of thread  by extending thread class.

        Thread t2=new MyThread2();        //it can also be done by directly creating the object of Mythread2 class i.e MyThread2 t2=new MyThread2();
        t2.start();                       //start() invokes the run method
    }
}
