package java_10thEdition.chapter_12;
//demonstrate the use of repeating annotation

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//make an anotation myAnno repetitive
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno2 {
    String str() default "Testing";
    int val() default  9000;
}

//this is container annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnno2 [] value();
}

public class RepeatAnno {

    //repeat annotation MyAnno2 in method myMeth
    @MyAnno2(str = "First annotation", val = -1)
    @MyAnno2(str = "Second annotation", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();

        try {
            Class<?> c =  ob.getClass();

            //get annotations for method myMeth()
            Method m = c.getMethod("myMeth", String.class, int.class);

            //output repeating annotation MyAnno2
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        }catch (NoSuchMethodException exc) {
            System.out.println("method not found");
        }
    }

    public static void main(String[] args) {
        myMeth("Test", 10);
    }
}
