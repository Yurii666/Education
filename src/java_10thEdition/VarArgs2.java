package java_10thEdition;

public class VarArgs2 {
    static void vaTest(String msg, int...v){
    System.out.print( msg + v.length + " Содержимое: ");
    for (int x:v)
        System.out.print( x + " ");
    System.out.println();
}
    public static void main(String[] args) {
        vaTest("Один параметр переменной длинны: ",10);
        vaTest("Чеыре параметра переменной длинны: ",1,2,3,4);
        vaTest("Без параметров переменной длинны: ");
    }

}
