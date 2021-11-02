package java_10thEdition;
class Box10 {
    double width;
    double height;
    double depth;

    Box10(Box10 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box10(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box10() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box10(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
class BoxWeight extends Box10{
    double weight;
    BoxWeight(double w, double h, double d, double m){
        width =w;
        height = h;
        depth = d;
        weight = m;
    }
}
public class DemoBoxWeight {
    public static void main(String[] args) {
       BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
       BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
       double vol;

       vol = mybox1.volume();
        System.out.println("Обем mybox1 равен: " + vol);
        System.out.println("вес mybox1 равен: " + mybox1.weight);

        vol = mybox2.volume();
        System.out.println("Обем mybox2 равен: " + vol);
        System.out.println("вес mybox2 равен: " + mybox2.weight);
    }
}
