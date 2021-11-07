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
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }


    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

}
