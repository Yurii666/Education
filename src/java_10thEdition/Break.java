package java_10thEdition;

public class Break {
    public static void main(String[] args) {
        boolean t= true;
        first:{
            second:{
            third:{
                System.out.println("Предшествует оператору break.");
                if(t) break second;
                System.out.println("1 ");
            }
                System.out.println("2 ");
            }
            System.out.println("3");
        }

    }
}
