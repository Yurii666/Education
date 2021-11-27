package java_10thEdition;
//This example from the book does not work
//java: constructor MyClass in class start.MyClass cannot be applied to given types;
//  required: java.lang.Long,java.lang.String
//  found:    no arguments
//  reason: actual and formal argument lists differ in length

import start.MyClass;

interface A14{
    void meth1();
    void meth2();
}
interface B14 extends A14{
    void meth3();
}
class Myclass implements B14{
    public void meth1() {
        System.out.println("Реализация метода meth1");
    }
    public void meth2() {
        System.out.println("Реализация метода meth2");
    }
    public void meth3() {
        System.out.println("Реализация метода meth3");
    }
}

 class IfExtend {
    public static void main(String[] args) {
       // MyClass ob = new MyClass();
       // ob.meth1();
       // ob.meth2();
       // ob.meth3();
    }
}
