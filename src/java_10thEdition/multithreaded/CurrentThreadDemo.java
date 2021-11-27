package java_10thEdition.multithreaded;

class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("current thread of execution: "+t);

        //rename of the thread of execution
        t.setName("MyThread");
        System.out.println("after rename of the thread of execution" + t);

        try {
            for(int n =5; n>0;n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("top the thread of execution interrupted");
        }
    }
}
