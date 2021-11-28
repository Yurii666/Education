package java_10thEdition.chapter_12;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//single-term annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int value (); //this variable must be named value
}

public class Single {
    @MySingle(100)
    public static void myMeth(){
        Single ob = new Single();

        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value());
            //outputs the value 100
        }catch (NoSuchMethodException exc) {
            System.out.println("method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
