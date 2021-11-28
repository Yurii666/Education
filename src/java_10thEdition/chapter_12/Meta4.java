package java_10thEdition.chapter_12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno1{
    String str() default "testing";
    int val() default 9000;
}

public class Meta4 {
    @MyAnno1()
    public static void myMeth() {
        Meta4 ob = new Meta4();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno1 anno = m.getAnnotation(MyAnno1.class);
            System.out.println(anno.str() + " " + anno.val());
        }catch (NoSuchMethodException exc){
            System.out.println("this method isn't found");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}
