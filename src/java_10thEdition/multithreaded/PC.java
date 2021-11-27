package java_10thEdition.multithreaded;
//incorrect implementation of supplier and consumer
class Q{
    int n;

    synchronized int get(){
        System.out.println("received: " + n);
        return n;
    }

    synchronized void put(int n){
        this.n = n;
        System.out.println("sent:  " + n);
    }
}
class Producer implements Runnable{
    Q q;

    Producer(Q q){
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
class Consumer implements Runnable{
    Q q;
    Consumer(Q q) {
        this.q = q;
        new Thread(this, "consumer" ).start();
    }
    public void run() {
        while (true){
            q.get();
        }
    }
}

public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("to stop press Ctrl+C");
    }
}
