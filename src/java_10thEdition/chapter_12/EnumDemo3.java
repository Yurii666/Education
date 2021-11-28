package java_10thEdition.chapter_12;

enum Apple2{
    Jonathan(10),GoldenDel(9), RedDel(12), Winesap(15),Cortland(8);
    private int price;  //prise apple every values
    Apple2(int p){
        price = p;
    }
    int getPrice(){
        return price;
    }
}
public class EnumDemo3 {
    public static void main(String[] args) {
        Apple2 ap;
        //print prise from values apple Winesap
        System.out.println("Winesap values apple price:"+ Apple2.Winesap.getPrice() + "cents.\n");
        //print price from all values apple
        System.out.println("price from all values apple: ");
        for(Apple2 a : Apple2.values()){
            System.out.println("Price " + a + " " + a.getPrice() + " cents.");
        }
    }
}
