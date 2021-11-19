package java_10thEdition.multithreaded;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread2 ob1 = new NewThread2("one");
        NewThread2 ob2 = new NewThread2("two");
        NewThread2 ob3 = new NewThread2("three");
        System.out.println("thread one started: " + ob1.t.isAlive());
        System.out.println("thread two started: " + ob2.t.isAlive());
        System.out.println("thread three started: " + ob3.t.isAlive());
        //wait for the threads to finish
        try{
            System.out.println("Wait for the tread to finish. ");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("top thread interrupted");
        }
        System.out.println("thread one started: " + ob1.t.isAlive());
        System.out.println("thread two started: " + ob2.t.isAlive());
        System.out.println("thread three started: " + ob3.t.isAlive());
        System.out.println("top thread finished");
    }
}
