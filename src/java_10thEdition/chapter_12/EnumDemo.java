package java_10thEdition.chapter_12;

//list of apple varieties
enum Apple{
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap=Apple.RedDel;
        //print values of enumerated type
        System.out.println("values ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;
        //compare two values of an enumerated type
        if(ap == Apple.GoldenDel){
            System.out.println("ap values is compare GoldenDell.\n");
        }
        //apply enumeration to control the switch operator
        switch (ap){
            case Jonathan:
                System.out.println("Jonathan variety is red");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious variety is yellow");
                break;
            case RedDel:
                System.out.println("Red Delicious variety is red");
                break;
            case Winesap:
                System.out.println("Winesap variety is red");
                break;
            case Cortland:
                System.out.println("Cortland variety is red");
                break;
        }
    }
}
