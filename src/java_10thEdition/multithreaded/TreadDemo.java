package java_10thEdition.multithreaded;
//create a second thread of execution
class NewTread implements Runnable{
    Thread t;

    NewTread(){
        //create a new,second thread of execution
        t = new Thread(this, "demonstration thread of execution");
        t.start();//starting the thread of execution
    }
    //entry point into the second thread of execution
    public void run(){
        try {
            for(int i =5 ; i > 0 ; i--){
                System.out.println("child thread: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println("child thread interrupted ");
        }
        System.out.println("child thread finished");
    }
}

public class TreadDemo {
    public static void main(String[] args) {
        new NewTread();//created a new thread of execution
        try {
            for(int i =5 ; i > 0 ; i--){
                System.out.println("top thread: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("child thread interrupted ");
        }
        System.out.println("child thread finished");
    }
}
