package java_10thEdition;
class A3{
    void callme(){
        System.out.println("In method callme from Constructor A.");
    }
}
class B3 extends A3{
    void callme(){
        System.out.println("In method callme from Constructor B");
    }
}
class C3 extends A3 {
    void callme() {
        System.out.println("In method callme from Constructor C");
    }
}
public class Dispatch {
    public static void main(String[] args) {
        A3 a = new A3();
        B3 b = new B3();
        C3 c = new C3();

        A3 r;

        r=a;
        r.callme();

        r = b;
        r.callme();

        r=c;
        r.callme();
    }
}
