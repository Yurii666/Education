package java_10thEdition;
class Shipment extends BoxWeight11{
    double cost;
    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }
    Shipment(double w,double h,double d,double m,double c){
        super(w, h, d, m);
        cost = c;
    }
    Shipment(){
        super();
        cost = -1;
    }
    Shipment(double len,double m,double c){
        super(len,m);
        cost = c;
    }
}
public class DemoShipment {
    public static void main(String[] args) {
        Shipment  shipment1 = new Shipment(10,20,15,10,3.14);
        Shipment  shipment2 = new Shipment(2,3,4,0.76,1.28 );

        double vol;
        vol = shipment1.volume();
        System.out.println("Обем shipment1 равен: " + vol);
        System.out.println("вес shipment1 равен: " + shipment1.weight);
        System.out.println("Стоимость доставки: $" + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Обем shipment2 равен: " + vol);
        System.out.println("вес shipment2 равен: " + shipment2.weight);
        System.out.println("Стоимость доставки: $" + shipment2.cost);
    }

}
