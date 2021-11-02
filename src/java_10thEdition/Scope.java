package java_10thEdition;
//demonstrate the scope of the code
public class Scope {
    public static void main(String[] args) {
        int x;//this variable is available to all code from the method main
        x = 10;
        if (x == 10) {//start of a new scope
            int y = 20; //available ony this block of code
            //both variable x and y avaliable in this scope
            System.out.println("x and y: " + x + " " + y);
        }
        // y = 100 //ERROR! variable y is not available in this scope,
        //whereas variable x available here
        System.out.println("x equals " + x);
    }
}
