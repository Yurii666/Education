package java_10thEdition.chapter_12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//annotation type declaration
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str();
    int val();
}

public class Meta {
    //annotate method
    @MyAnno(str = "example annotation", val = 100)
    public static void myMeth(){
        Meta ob = new Meta();
        //get annotation from method and output values of its members
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        }catch (NoSuchMethodException exc) {
            System.out.println("This method is not found");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}
