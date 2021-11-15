package java_10thEdition.exceptionHandling;

public class ThrowDemo {
    static void demoproc(){
        try{
            throw new NullPointerException("Demonstration");
        }catch (NullPointerException e){
            System.out.println("in method demoproc()");
            throw e;
        }

    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e){
            System.out.println("a new interseption");
        }
    }
}
