package java_10thEdition.multithreaded;
//Used synchronized thread in this program
class Caller1 implements Runnable{
    String msg;
    Callme target;
    Thread t;
    public  Caller1(Callme targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run(){
        synchronized (target){
            target.call(msg);
        }
    }
}


public class Synch1 {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller1 ob1 = new Caller1(target, "welcome");
        Caller1 ob2 = new Caller1(target, "in sinchronized");
        Caller1 ob3 = new Caller1(target, "world!");
        //wait for the threads to finish
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("interrupted");
        }
    }
}
