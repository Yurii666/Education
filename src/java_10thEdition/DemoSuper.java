package java_10thEdition;
class Box11 {
    double width;
    double height;
    double depth;

    Box11(Box11 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box11(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box11() {
        width = -1;
        height = -1;
        depth = -1;
    }
    Box11(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
class BoxWeight11 extends Box11{
    double weight;
    BoxWeight11(BoxWeight11 ob){
        super(ob);
        weight = ob.weight;
    }
    BoxWeight11(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }
    BoxWeight11(){
        super();
        weight = -1;
    }
    BoxWeight11(double len,double m){
        super(len);
        weight = m;
    }
}
public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight11 mybox1 = new BoxWeight11(10,20,15,34.3);
        BoxWeight11 mybox2 = new BoxWeight11(2,3,4,0.076);
        BoxWeight11 mybox3 = new BoxWeight11();
        BoxWeight11 mycube = new BoxWeight11(3,2);
        BoxWeight11 myclone = new BoxWeight11(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Обем mybox1 равен: " + vol);
        System.out.println("вес mybox1 равен: " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Обем mybox2 равен: " + vol);
        System.out.println("вес mybox2 равен: " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Обем mybox3 равен: " + vol);
        System.out.println("вес mybox3 равен: " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Обем myclone равен: " + vol);
        System.out.println("вес myclone равен: " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Обем mycube равен: " + vol);
        System.out.println("вес mycube равен: " + mycube.weight);
        System.out.println();
    }
}
