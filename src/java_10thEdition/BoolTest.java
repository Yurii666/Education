package java_10thEdition;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b= false;
        System.out.println("b equals " + b);
        b= true;
        System.out.println("b equels " + b);
        if(b) System.out.println("This code is executed");
        b=false;
        if(b) System.out.println("This code don't executed");

        System.out.println("10>9 equals" + (10>9));
    }
}
