package java_10thEdition;
class Factorial{
    int fact(int n){
        int result;
        if(n==1) return 1;
        result = fact(n-1)*n;
        return result;
    }
}
public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Factorial 3 equals " + f.fact(3));
        System.out.println("Factorial 4 equals " + f.fact(4));
        System.out.println("Factorial 5 equals " + f.fact(5));
    }
}
