package java_10thEdition;
class A15{
    public interface NestedIf{
        boolean isNotNegative(int x);
    }
}
class B15 implements A15.NestedIf{
    public boolean isNotNegative(int x){
        return x<0? false:true;
    }
}
public class NestedIFDemo {
    public static void main(String[] args) {
        A15.NestedIf nif= new B15();
        if(nif.isNotNegative(15))
            System.out.println("число 10 неотрицательное");
        if (nif.isNotNegative(-12))
            System.out.println("это не будет выведено");
    }
}
