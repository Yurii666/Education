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
        return (char)array[index];
    }
    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        byte[] x = new byte[end-start];
        for (int i = 0; i<end-start;i++) {
            x[i] = (array[i+start]);
        }
        AsciiCharSequence ex = new AsciiCharSequence(x);
        return ex;
    }

    @Override
    public String toString() {
        return new String(array);
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