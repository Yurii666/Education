package java_10thEdition.exceptionHandling;

public class ChainExcDemo {
    static void demoproc(){
        //throw an exception
        NullPointerException e = new NullPointerException("top level");
        //add the reason for the exception
        e.initCause(new ArithmeticException("reason"));
        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e){
            //return an exception top level
            System.out.println("caught an exception: " + e);
            //return the exception that caused the top-level exception
            System.out.println("root cause: " + e.getCause());
        }
    }
}
