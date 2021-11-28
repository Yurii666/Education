package java_10thEdition.chapter_12;
//demonstrate the application of methods ordinal(), compareTo() and equals()

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap,ap2,ap3;
        //get all ordinal values using method ordinal()
        System.out.println("all constants of apple varieties and their ordinal numbers: ");
        for (Apple a : Apple.values()){
            System.out.println(a + " " + a.ordinal());
        }
        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        System.out.println();
        //demonstrate the application of methods compareTo() and equals()

        if(ap.compareTo(ap2)<0)  { System.out.println(ap + " preceded " + ap2); }
        if(ap.compareTo(ap2)>0)  { System.out.println(ap2 + " preceded " + ap); }
        if(ap.compareTo(ap3)==0) { System.out.println(ap + " equals " + ap3); }
        System.out.println();
        if (ap.equals(ap2)) { System.out.println("ERROR! "); }
        if (ap.equals(ap3)) { System.out.println(ap + " equals " + ap3); }
        if (ap == ap3) { System.out.println(ap + " == " + ap3); }
    }
}
