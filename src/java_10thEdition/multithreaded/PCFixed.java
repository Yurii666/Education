package java_10thEdition.multithreaded;
class Q1{
    int n;
    boolean valueSet = false;

    synchronized int get(){
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("exception type InterruptedException caught");
            }
            System.out.println("received: " + n);
            valueSet = false;
            notify();
        return n;
    }

    synchronized void put(int n){
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("exception type InterruptedException caught");
            }
            this.n = n;
            valueSet = true;
            System.out.println("sent:  " + n);
            notify();

    }
}
class Producer1 implements Runnable{
    Q1 q;

    Producer1(Q1 q){
        this.q = q;
        new Thread(this, "Supplier").start();
    }
    public void run(){
        int i = 0;
        while(true){
            q.put(i++);
        }
    }
}
class Consumer1 implements Runnable{
    Q1 q;
    Consumer1(Q1 q) {
        this.q = q;
        new Thread(this, "consumer" ).start();
    }
    public void run() {
        while (true){
            q.get();
        }
    }
}
public class PCFixed {
    public static void main(String[] args) {
        Q1 q = new Q1();
        new Producer1(q);
        new Consumer1(q);

        System.out.println("to stop press Ctrl+C");
    }
}
