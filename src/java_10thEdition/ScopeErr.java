package java_10thEdition;

public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {            //create new scope
         //int bar = 2;//compile-time error
                     //variable bar is already defined;
        }
    }
}
