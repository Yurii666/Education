package java_10thEdition.chapter_12;
//autoboxing and unpacking values from classes Boolean and b
public class AutoBox5 {
    public static void main(String[] args) {
        Boolean b = true;
        if (b) { System.out.println("b equals true"); }

        Character ch = 'x';
        char ch2 = ch;
        System.out.println("ch2 equals " + ch2);
    }
}
