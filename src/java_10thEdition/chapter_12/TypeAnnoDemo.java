package java_10thEdition.chapter_12;
//Demonstrate the use of some typical annotations
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
//Annotation marker that can be applied to a data type
@Target(ElementType.TYPE_USE)
@interface TypeAnno{ }

//One more annotation marker that can be applied to a data type
@Target(ElementType.TYPE_USE)
@interface NotZeroLen{ }

//And one more annotation marker that can be applied to a data type
@Target(ElementType.TYPE_USE)
@interface Unique{ }

//Parameterized Annotation that can be applied to a data type
@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

//Annotation that can be applied to a type parameter
@Target(ElementType.TYPE_PARAMETER)
@interface What2 {
    String description();
}

//Annotation that can be used in a field declaration
@Target(ElementType.FIELD)
@interface EmptyOK{ }

//Annotation that can be used in a method declaration
@Target(ElementType.METHOD)
@interface Recommended{ }

//apply annotation on type parameter
public class TypeAnnoDemo<@What2(
    description = "generic data") T>{
    //apply generic annotation in constructor
    public @Unique TypeAnnoDemo(){ }

    //Annotate type but not field
    @TypeAnno String str;

    //annotate field test
    @EmptyOK String test;

    //apply generic annotation to annotate link this to object
    public int f(@TypeAnno TypeAnnoDemo<T> this, int x){
        return 10;
    }
    //annotate the return type
    public @TypeAnno Integer f2(int j, int k){
        return j+k;
    }
    //annotate method declaration
    public @Recommended Integer f3(String str){
        return str.length()/2;
    }
    //apply generic annotation in throws statement
    public void f4() throws @TypeAnno NullPointerException{
        //..
    }
    //annotate array access levels
    String @MaxLen(10) [] @NotZeroLen [] w;

    //annotate the element type of the array
    @TypeAnno Integer[] vec;

    public static void myMeth(int i){
        //apply type annotation on type argument
        TypeAnnoDemo<@TypeAnno Integer> ob = new TypeAnnoDemo<@TypeAnno Integer>();

        //apply generic annotation in statement new
        @Unique TypeAnnoDemo<Integer> ob2 = new @Unique TypeAnnoDemo<Integer>();

        Object x = new Integer(10);
        Integer y;

        //apply type annotation in application of types
        y = (@TypeAnno Integer) x;
    }
    public static void main(String[] args) {
        myMeth(10);
    }
    //apply generic annotation in inheritance expression
    class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean>{}
}
