package java_10thEdition.chapter_13;

import java.io.PrintWriter;

//Demonstrate the use of a PrintWriter class.
public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true );
        pw.println("this is a line");
        int i =7;
        pw.println(i);
        double d =5.56e-6;
        pw.println(d);
    }
}
