package java_10thEdition;

class MyIFImp implements MyIF{
    @Override
    public int getNumber() {
        return 100;
    }
}

public class DefaultMethoDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
    }
}
