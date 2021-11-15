package java_10thEdition.exceptionHandling;

public class FinallyDemo {
    static void procA(){
        try{
            System.out.println("try in method procA");
            throw  new RuntimeException("demonstration");
        }finally {
            System.out.println("finally in method procA(). " );
        }
    }
    static void procB(){
        try{
            System.out.println("in method procB(). ");
            return;
        }finally {
            System.out.println("finally in method procB(). " );
        }
    }
    static void procC(){
        try{
            System.out.println("in method procC(). ");
            return;
        }finally {
            System.out.println("finally in method procC(). " );
        }
    }

    public static void main(String[] args) {
        try{
            procA();
        }catch(Exception e){
            System.out.println("caught an exception");
        }
        procB();
        procC();
    }
}
