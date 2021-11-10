package Stepic;

//Write an AsciiCharSequence class that compactly stores a sequence of ASCII characters in a byte array.
//
//The AsciiCharSequence class must:
//
//implement the java.lang.CharSequence interface;
//have a constructor that accepts an array of bytes;
//define methods length (), charAt (), subSequence () and toString ()
//
//In this task, the charAt () and subSequence () methods will always be supplied with correct input parameters,
// so there is no need to check them and handle errors.

import java.util.Arrays;

class AsciiCharSequence implements CharSequence{
    private byte array[];

    //здесь должен быть конструктор, что принимает массив байт
    AsciiCharSequence(byte[] array) {
        this.array = array;
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int index) {
        char charA = new String(array[index], "UTF-16").toCharArray;
        return charA;
    }
    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder x = new StringBuilder("");
        for (int i = start; i<end;i++)
            x.append(new String(array[i], "UTF-16"));
        return x;
    }

    @Override
    public String toString() {

        return Arrays.toString(array);
    }
}
public class AsciiCharSequenceDemo {
    public static void main(String[] args) {
        byte[] x = new byte[]{65,66,67,68,69,70,71};
        AsciiCharSequence myX = new AsciiCharSequence(x);
        System.out.println(myX.length());
        System.out.println(myX.charAt(3));
        System.out.println(myX.subSequence(3,5));
        System.out.println(myX.toString());
    }
}