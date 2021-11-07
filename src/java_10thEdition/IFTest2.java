package java_10thEdition;
class DynStack implements IntStack{
    private int stck[];
    private int tos;
    DynStack(int size){
        stck=new int[size];
        tos = -1;
    }

    public void push(int item) {
        if(tos == stck.length-1){
            int temp[] = new int[stck.length*2];
            for(int i = 0;i<stck.length;i++ )temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }
        else
            stck[++tos] = item;
    }
    public  int pop(){
        if (tos<0){
            System.out.println("Стек не  загружен");
            return 0;
        }else
            return stck[tos--];

    }
}
public class IFTest2 {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);
        for(int i=0;i<5;i++) mystack1.push(i);
        for(int i=0;i<8;i++) mystack2.push(i);
        System.out.println("переменные в стеке mystack1: ");
        for(int i=0;i<5;i++) System.out.println(mystack1.pop());
        System.out.println("переменные в стеке mystack2: ");
        for(int i=0;i<8;i++) System.out.println(mystack2.pop());
    }
}
