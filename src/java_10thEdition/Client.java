package java_10thEdition;

import javax.security.auth.callback.Callback;

class AnotherClient implements Callback {
    public void callback(int p){
        System.out.println(" метод Callback, вызываемый со значением "+ p);
    }
    void nonIfaceMeth(){
        System.out.println("в классах , реализующих интерфейсы, "+ "могут определятся и другие члены.");
    }
}
class Client implements Callback {
    public void callback(int p) {
        System.out.println(" p в квадрате равно " + (p*p));
    }
}
class TestIface{
    public static void main(String[] args) {
        // пример с книги не работает, пришлось по другому
        //Callback c = new Client();
        //
        Client c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(42);
        //c = ob;это не работает
        //c.callback(42);
        ob.callback(42);
    }
}
abstract class Incomplete implements Callback{
    int a,b;
    void show(){
        System.out.println(a + " " + b);
    }
}