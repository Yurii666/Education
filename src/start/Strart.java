package start;
//This package is for running in some methods, later used somewhere
import java.util.HashSet;
import java.util.Set;

public final class Strart {
    public  static void main(String[] args) {

        Set<MyClass> set = new HashSet<>();
        System.out.println("1");
       set.add(new MyClass(11L, "name1"));
        System.out.println("2");
       set.add(new MyClass(12L, "name2"));
        System.out.println("3");
        set.add(new MyClass(13L, "name3"));
        System.out.println("4");
        set.add(new MyClass(11L, "name1"));
        System.out.println("SIZE:" + set.size());
    }
}
