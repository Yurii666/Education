package java_10thEdition.exceptionHandling;

class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42/a;
            int[] c = {1};
            c[42]=99;
        }catch(ArithmeticException e){
            System.out.println("drop from zero" + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of bounds indexing error" + e);
        }
        System.out.println("after block operators try//catch");
    }
}
