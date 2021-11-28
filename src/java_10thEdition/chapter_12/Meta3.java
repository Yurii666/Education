package java_10thEdition.chapter_12;
//show all annotations for class and method

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface What{
    String description();
}

@What(description = "this is a text type annotation")
@MyAnno(str = "Meta3", val = 99)
public class Meta3 {
    @What(description = "this is a text metod annotation")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth(){
        Meta3 ob = new Meta3();

        try {
            Annotation annos[] = ob.getClass().getAnnotations();
            //show all annotations for class Meta3
            System.out.println("This are all annotations for class Meta3");
            for (Annotation a : annos) { System.out.println(a); }
            System.out.println();

            //show all annotations for type myMeth
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("This are all annotations for type myMeth ");
            for (Annotation a : annos) { System.out.println(a); }
        }catch (NoSuchMethodException exc) {
            System.out.println("this method isn't found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
