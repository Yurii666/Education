package java_10thEdition.multithreaded;
//suspension and resumption of stream execution using modern methods

class NewThread3 implements Runnable{
    String name;//name thread of execution
    Thread t;
    boolean suspendFlag;

    NewThread3(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("This is a new thread" +t);
        t.start();//starting the thread of execution
    }
    //entry point into the second thread of execution
    public void run(){
        try {
            for(int i =5 ; i > 0 ; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        }catch (InterruptedException e) {
            System.out.println(name + " interrupted ");
        }
        System.out.println(name + " finished");
    }
    synchronized void mysuspend(){
        suspendFlag = true;
    }
    synchronized void myresume(){
        suspendFlag = false;
        notify();
    }
}

public class SuspendResume {
    public static void main(String[] args) {
        NewThread3 ob1 = new NewThread3("One");
        NewThread3 ob2 = new NewThread3("Two");

        try{
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("suspension thread One");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("renewal thread One" );
            ob2.mysuspend();
            System.out.println("suspension thread Two");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("renewal thread Two" );
        }catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        //wait for the threads to finish
        try {
            System.out.println("wait threads finished");
            ob1.t.join();
            ob2.t.join();
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread finished");
    }
}
