package java_10thEdition;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box10 pleinbox = new Box10();
        double vol;

        vol = weightbox.volume();
        System.out.println("Обем weightbox равен: " + vol);
        System.out.println("вес weightbox равен: " + weightbox.weight);
        System.out.println();
        pleinbox = weightbox;
        vol = pleinbox.volume();
        System.out.println("Обем pleinbox равен: " + vol);
        //System.out.println("вес pleinbox равен: " + pleinbox.weight);
    }
}
