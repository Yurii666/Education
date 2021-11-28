package java_10thEdition.chapter_12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("enumerated type constants Apple: ");
        //apply the values() method:
        Apple allapples[] = Apple.values();
        for(Apple a : allapples){
            System.out.println(a);
        }
        System.out.println();
        //apply the valueOf() method:
        ap = Apple.valueOf("Winesap");
        System.out.println("values ap: " + ap);
    }
}
