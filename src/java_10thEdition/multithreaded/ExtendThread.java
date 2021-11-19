package java_10thEdition.multithreaded;
//create a second thread of execution,expanding the class of Thread
class NewThread extends Thread{
    NewThread(){
        //create a new thread of execution
        super("demonstration thread");
        System.out.println("child thread: " + this);
        start();//starting the thread of execution
    }
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

class ExtendThread {
    public static void main(String[] args) {
        new NewThread();//created a new thread of execution
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
