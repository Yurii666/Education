package java_10thEdition.chapter_12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// This is marker annotate
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker { }

//annotate the method with a marker
public class Marker {
   @MyMarker
    public static void myMeth(){
       Marker ob = new Marker();

       try{
           Method m = ob.getClass().getMethod("myMeth");
           //determine if annotation is present
           if(m.isAnnotationPresent(MyMarker.class)) {
               System.out.println("marker annotation MyMarker is present");
           }
       }catch (NoSuchMethodException exc) {
           System.out.println("method not found");
       }
   }

    public static void main(String[] args) {
        myMeth();
    }

}
