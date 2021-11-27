package java_10thEdition.multithreaded;
//create a several thread of execution
class NewThread2 implements Runnable{
    String name;//name thread of execution
    Thread t;

    NewThread2(String threadname){
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
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println(name + " interrupted ");
        }
        System.out.println(name + " finished");
    }
}
public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread2("one");//starting thread of execution
        new NewThread2("two");
        new NewThread2("three");
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("top thread interrupted");
        }
        System.out.println("top thread finished");
    }
}
