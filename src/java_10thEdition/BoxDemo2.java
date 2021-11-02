package java_10thEdition;
class Box1{
    double width;
    double height;
    double depth;
}

class BoxDemo2 {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();
        double vol;
        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;
        mybox2.width=3;
        mybox2.height=6;
        mybox2.depth = 9;
        vol = mybox1.depth*mybox1.height* mybox1.width;
        System.out.println("объем равен " + vol);
        vol = mybox2.depth*mybox2.height* mybox2.width;
        System.out.println("объем равен " + vol);
    }

}
