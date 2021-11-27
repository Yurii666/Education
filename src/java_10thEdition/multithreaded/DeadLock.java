package java_10thEdition.multithreaded;
//deadlock example
class A{
    synchronized void foo(B b){
        String name = Thread.currentThread().getName();

        System.out.println(name + "entered method A.foo()");
        try{
            Thread.sleep(1000);
        }catch (Exception e) {
            System.out.println("class A interrupted");
        }
        System.out.println(name + "trying to call the method B.last()");
        b.last();
    }
    synchronized void last(){
        System.out.println("in method A.last()");
    }
}
class B{
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();

        System.out.println(name + "entered method B.bar()");
        try{
            Thread.sleep(1000);
        }catch (Exception e) {
            System.out.println("class B interrupted");
        }
        System.out.println(name + "trying to call the method A.last()");
        a.last();
    }
    synchronized void last(){
        System.out.println("in method A.last()");
    }
}

public class DeadLock implements Runnable{
    A a =new A();
    B b =new B();
    DeadLock(){
        Thread.currentThread().setName("main stream");
        Thread t = new Thread(this, "Second stream");
        t.start();

        a.foo(b);//acquire a lock for object а on a given thread of execution
        System.out.println("back to main stream" );
    }

    @Override
    public void run() {
        b.bar(a);//acquire a lock for object A in another thread of execution
        System.out.println("back to another stream" );
    }

    public static void main(String[] args) {
        new DeadLock();
    }
}
