package java_10thEdition;
//demonstrate validity variable
public class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x=0; x<3;x++){
            int y = -1; //variable y initialized at each entry into the code block
            System.out.println("y equals: " + y);
            y=100;
            System.out.println("y now equals : " + y);
        }

    }
}
