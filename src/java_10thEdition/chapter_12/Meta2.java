package java_10thEdition.chapter_12;

import java.lang.reflect.Method;

public class Meta2 {
    @MyAnno(str ="Two parametrs", val = 19)
    public static void myMeth(String str, int i){
        Meta2 ob = new Meta2();

        try{
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        }catch (NoSuchMethodException exc) {
            System.out.println("This method is not found");
        }
    }

    public static void main(String[] args) {
        myMeth("Test", 10);
    }
}
